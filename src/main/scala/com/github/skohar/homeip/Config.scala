package com.github.skohar.homeip

import com.typesafe.config.ConfigFactory

object Config {
  val config = ConfigFactory.load
  val HostedZoneId = config.getString("hostedZoneId")
  val HostName = config.getString("hostName")
  val TTL = config.getLong("ttl")
}
