package com.ijoic.log

/**
 * Log handler.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
interface LogHandler {
  /**
   * Dispatch log message.
   *
   * @param level level.
   * @param tag tag.
   * @param message message.
   * @param error error.
   *
   * @see android.util.Log.VERBOSE
   * @see android.util.Log.DEBUG
   * @see android.util.Log.INFO
   * @see android.util.Log.WARN
   * @see android.util.Log.ERROR
   * @see android.util.Log.ASSERT
   */
  fun dispatch(level: Int, tag: String, message: String, error: Throwable?)
}