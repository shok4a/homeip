package com.github.skohar.homeip

import com.amazonaws.services.lambda.runtime.Context

class App {
  def myHandler(myCount: Int, context: Context): String = {
    val logger = context.getLogger
    logger.log("received : " + myCount)
    logger.log("version : " + 1)
    String.valueOf(myCount)
  }
}
