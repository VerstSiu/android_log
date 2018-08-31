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
class TagFixLazyLogManager internal constructor(
    private val tag: String, handler: LogHandler): LogManager(handler) {

  /**
   * Send a VERBOSE log message.
   *
   * @param getMessage generate log message.
   */
  fun v(getMessage: () -> String) {
    dispatchLogMessage(Log.VERBOSE, tag, getMessage, null)
  }

  /**
   * Send a VERBOSE log message.
   *
   * @param error error.
   * @param getMessage generate log message.
   */
  fun v(error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.VERBOSE, tag, getMessage, error)
  }

  /**
   * Send a DEBUG log message.
   *
   * @param getMessage generate log message.
   */
  fun d(getMessage: () -> String) {
    dispatchLogMessage(Log.DEBUG, tag, getMessage, null)
  }

  /**
   * Send a DEBUG log message.
   *
   * @param error error.
   * @param getMessage generate log message.
   */
  fun d(error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.DEBUG, tag, getMessage, error)
  }

  /**
   * Send a INFO log message.
   *
   * @param getMessage generate log message.
   */
  fun i(getMessage: () -> String) {
    dispatchLogMessage(Log.INFO, tag, getMessage, null)
  }

  /**
   * Send a INFO log message.
   *
   * @param error error.
   * @param getMessage generate log message.
   */
  fun i(error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.INFO, tag, getMessage, error)
  }

  /**
   * Send a WARN log message.
   *
   * @param getMessage generate log message.
   */
  fun w(getMessage: () -> String) {
    dispatchLogMessage(Log.WARN, tag, getMessage, null)
  }

  /**
   * Send a WARN log message.
   *
   * @param error error.
   * @param getMessage generate log message.
   */
  fun w(error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.WARN, tag, getMessage, error)
  }

  /**
   * Send a ERROR log message.
   *
   * @param getMessage generate log message.
   */
  fun e(getMessage: () -> String) {
    dispatchLogMessage(Log.ERROR, tag, getMessage, null)
  }

  /**
   * Send a ERROR log message.
   *
   * @param error error.
   * @param getMessage generate log message.
   */
  fun e(error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.ERROR, tag, getMessage, error)
  }

  /**
   * Send a ASSERT log message.
   *
   * @param getMessage generate log message.
   */
  fun wtf(getMessage: () -> String) {
    dispatchLogMessage(Log.ASSERT, tag, getMessage, null)
  }

  /**
   * Send a ASSERT log message.
   *
   * @param error error.
   * @param getMessage generate log message.
   */
  fun wtf(error: Throwable?, getMessage: () -> String) {
    dispatchLogMessage(Log.ASSERT, tag, getMessage, error)
  }
}