package com.github.skohar.homeip

import com.typesafe.config.ConfigFactory

class Config {
  private val config = ConfigFactory.load
  val HostedZoneId = config.getString("hostedZoneId")
  val HostName = config.getString("hostName")
  val TTL = config.getLong("ttl")
}
