package com.ijoic.log

import com.ijoic.flagbus.FlagBus

/**
 * Log manager.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
abstract class LogManager internal constructor(private val handler: LogHandler) {

  /**
   * Dispatch log message.
   *
   * @param level level.
   * @param tag tag.
   * @param getMessage generate log message.
   * @param error error.
   */
  protected fun dispatchLogMessage(level: Int, tag: String, getMessage: () -> String, error: Throwable?) {
    // skip log event for release mode
    if (!FlagBus.isDebugEnabled) {
      return
    }
    handler.dispatch(level, tag, getMessage(), error)
  }

  /**
   * Dispatch log message.
   *
   * @param level level.
   * @param tag tag.
   * @param message message.
   * @param error error.
   */
  protected fun dispatchLogMessage(level: Int, tag: String, message: String, error: Throwable?) {
    // skip log event for release mode
    if (!FlagBus.isDebugEnabled) {
      return
    }
    handler.dispatch(level, tag, message, error)
  }
}