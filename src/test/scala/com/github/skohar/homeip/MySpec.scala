package com.github.skohar.homeip

import java.net.InetAddress

import org.scalatest.FlatSpec

class MySpec extends FlatSpec {
  "a" should "not equals to b" in {
    assert("a" !== "b")
  }

  "a" should "b" in {
    new App().myHandler("192.168.0.1",null)
    assert(1 === 1)
  }
}
