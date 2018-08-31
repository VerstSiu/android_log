package com.ijoic.log.handler

import android.util.Log
import com.ijoic.log.LogHandler

/**
 * Default log handler.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
internal object DefaultLogHandler: LogHandler {
  override fun dispatch(level: Int, tag: String, message: String, error: Throwable?) {
    when(level) {
      Log.VERBOSE -> Log.v(tag, message, error)
      Log.DEBUG -> Log.d(tag, message, error)
      Log.INFO -> Log.i(tag, message, error)
      Log.WARN -> Log.w(tag, message, error)
      Log.ERROR -> Log.e(tag, message, error)
      Log.ASSERT -> Log.wtf(tag, message, error)
    }
  }

}