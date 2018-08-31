package com.ijoic.log.manager

import android.util.Log
import com.ijoic.log.LogHandler
import com.ijoic.log.LogManager

/**
 * Lazy log manager.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
open class LazyLogManager internal constructor(handler: LogHandler): LogManager(handler) {

  /**
   * Send a VERBOSE log message.
   *
   * @param tag tag.
   * @param getMessage generate log message.
   */
  fun v(tag: String, getMessage: () -> String) {
    dispatchLogMessage(Log.VERBOSE, tag, getMessage, null)
  }

  /**
   * Send a VERBOSE log message.
   *
   * @param tag tag.
   * @param error error.
   * @param getMessage generate log message.
   */
  fun v(tag: String, error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.VERBOSE, tag, getMessage, error)
  }

  /**
   * Send a DEBUG log message.
   *
   * @param tag tag.
   * @param getMessage generate log message.
   */
  fun d(tag: String, getMessage: () -> String) {
    dispatchLogMessage(Log.DEBUG, tag, getMessage, null)
  }

  /**
   * Send a DEBUG log message.
   *
   * @param tag tag.
   * @param error error.
   * @param getMessage generate log message.
   */
  fun d(tag: String, error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.DEBUG, tag, getMessage, error)
  }

  /**
   * Send a INFO log message.
   *
   * @param tag tag.
   * @param getMessage generate log message.
   */
  fun i(tag: String, getMessage: () -> String) {
    dispatchLogMessage(Log.INFO, tag, getMessage, null)
  }

  /**
   * Send a INFO log message.
   *
   * @param tag tag.
   * @param error error.
   * @param getMessage generate log message.
   */
  fun i(tag: String, error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.INFO, tag, getMessage, error)
  }

  /**
   * Send a WARN log message.
   *
   * @param tag tag.
   * @param getMessage generate log message.
   */
  fun w(tag: String, getMessage: () -> String) {
    dispatchLogMessage(Log.WARN, tag, getMessage, null)
  }

  /**
   * Send a WARN log message.
   *
   * @param tag tag.
   * @param error error.
   * @param getMessage generate log message.
   */
  fun w(tag: String, error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.WARN, tag, getMessage, error)
  }

  /**
   * Send a ERROR log message.
   *
   * @param tag tag.
   * @param getMessage generate log message.
   */
  fun e(tag: String, getMessage: () -> String) {
    dispatchLogMessage(Log.ERROR, tag, getMessage, null)
  }

  /**
   * Send a ERROR log message.
   *
   * @param tag tag.
   * @param error error.
   * @param getMessage generate log message.
   */
  fun e(tag: String, error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.ERROR, tag, getMessage, error)
  }

  /**
   * Send a ASSERT log message.
   *
   * @param tag tag.
   * @param getMessage generate log message.
   */
  fun wtf(tag: String, getMessage: () -> String) {
    dispatchLogMessage(Log.ASSERT, tag, getMessage, null)
  }

  /**
   * Send a ASSERT log message.
   *
   * @param tag tag.
   * @param error error.
   * @param getMessage generate log message.
   */
  fun wtf(tag: String, error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.ASSERT, tag, getMessage, error)
  }
}