package com.nature.hub.gotest.main

import com.nature.hub.gotest.common.SomeCommonClass

class One {
  def useTheCommon(s:String) = new SomeCommonClass().someCommonFunction(s)
}
