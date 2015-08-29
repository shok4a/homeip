package com.github.skohar.homeip

import com.amazonaws.services.lambda.runtime.Context

class App {
  def myHandler(myCount: String, context: Context): String = {
    val logger = context.getLogger
    logger.log("received : " + myCount)
    String.valueOf(myCount)
  }
  ""
}
