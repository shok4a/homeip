package com.github.skohar.homeip

import play.api.libs.json.Json

object Config {
  implicit val reads = Json.reads[Config]
}
case class Config(hostedZoneId: String, hostName: String, ttl: Long)
