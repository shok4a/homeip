package com.github.skohar.homeip

import java.net.InetAddress

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.route53.AmazonRoute53Client
import com.amazonaws.services.route53.model._

import scala.collection.JavaConversions._
import scala.util.Try

class App {

  def myHandler(myCount: String, context: Context): String = {
    (for {
      address <- Try(InetAddress.getByName(myCount)).toOption
    } yield {
      val recordSet = new AmazonRoute53Client()
        .listResourceRecordSets(new ListResourceRecordSetsRequest(Config.HostedZoneId)).getResourceRecordSets
        .filter(_.getType == RRType.A.toString).find(_.getName == s"${Config.HostName}.")
      val action = recordSet match {
        case Some(_) => ChangeAction.UPSERT
        case None => ChangeAction.CREATE
      }
      val requestRecordSet = new ResourceRecordSet().withName(Config.HostName).withType(RRType.A).withTTL(Config.TTL)
        .withResourceRecords(new ResourceRecord(address.getHostAddress) :: Nil)
      val change = new Change(action, requestRecordSet)
      val batch = new ChangeBatch(change :: Nil)
      val request = new ChangeResourceRecordSetsRequest(Config.HostedZoneId, batch)
      new AmazonRoute53Client().changeResourceRecordSets(request)
    }) match {
      case Some(_) => "OK"
      case None => ""
    }
  }
}
