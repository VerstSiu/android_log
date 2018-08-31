package com.ijoic.log

import com.ijoic.log.handler.DefaultLogHandler
import com.ijoic.log.manager.LazyLogManager
import com.ijoic.log.manager.SimpleLogManager
import com.ijoic.log.manager.TagFixLazyLogManager
import com.ijoic.log.manager.TagFixLogManager

/**
 * Log manager factory.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
object LogManagerFactory {
  /**
   * Returns simple log manager instance.
   *
   * @param handler handler.
   */
  @JvmStatic
  fun simple(handler: LogHandler? = null) = SimpleLogManager(wrapHandler(handler))

  /**
   * Returns simple log manager instance.
   *
   * @param tag tag.
   * @param handler handler.
   */
  @JvmStatic
  fun simple(tag: String, handler: LogHandler? = null) = TagFixLogManager(tag, wrapHandler(handler))

  /**
   * Returns lazy log manager instance.
   *
   * @param handler handler.
   */
  @JvmStatic
  fun lazy(handler: LogHandler? = null) = LazyLogManager(wrapHandler(handler))

  /**
   * Returns lazy log manager instance.
   *
   * @param tag tag.
   * @param handler handler.
   */
  @JvmStatic
  fun lazy(tag: String, handler: LogHandler? = null) = TagFixLazyLogManager(tag, wrapHandler(handler))

  /**
   * Returns wrapped non-null log handler.
   *
   * @param handler handler.
   */
  private fun wrapHandler(handler: LogHandler? = null): LogHandler {
    return handler ?: DefaultLogHandler
  }
}