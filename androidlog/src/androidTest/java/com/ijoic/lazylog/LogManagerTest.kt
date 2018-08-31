package com.ijoic.lazylog

import com.ijoic.log.LogManager

/**
 *
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
class LogManagerTest {

  fun testLogSimple() {
    val manager = LogManager()

    manager.e("") { "" }
  }

  fun testLogError() {

  }

}