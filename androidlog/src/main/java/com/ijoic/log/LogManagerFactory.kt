/*
 *
 *  Copyright(c) 2018 VerstSiu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
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