package com.ijoic.log.manager

import android.util.Log
import com.ijoic.log.LogHandler
import com.ijoic.log.LogManager

/**
 * Simple log manager.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
open class SimpleLogManager internal constructor(handler: LogHandler): LogManager(handler) {
  /**
   * Send a VERBOSE log message.
   *
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun v(tag: String, message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.VERBOSE, tag, message, error)
  }

  /**
   * Send a DEBUG log message.
   *
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun d(tag: String, message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.DEBUG, tag, message, error)
  }

  /**
   * Send a INFO log message.
   *
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun i(tag: String, message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.INFO, tag, message, error)
  }

  /**
   * Send a WARN log message.
   *
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun w(tag: String, message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.WARN, tag, message, error)
  }

  /**
   * Send a ERROR log message.
   *
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun e(tag: String, message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.ERROR, tag, message, error)
  }

  /**
   * Send a ASSERT log message.
   *
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun wtf(tag: String, message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.ASSERT, tag, message, error)
  }
}