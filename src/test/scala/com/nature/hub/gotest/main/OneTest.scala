package com.nature.hub.gotest.main

import org.hamcrest.CoreMatchers.is
import org.hamcrest.MatcherAssert.assertThat
import org.scalatest.FunSuite

class OneTest extends FunSuite {
  test("one test") {
    val one = new One()
    assertThat(one.useTheCommon("ONE"), is("this is a common [ONE]"))
  }
}
