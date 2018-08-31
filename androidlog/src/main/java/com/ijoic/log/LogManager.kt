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