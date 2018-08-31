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
package com.ijoic.log.manager

import android.util.Log
import com.ijoic.log.LogHandler
import com.ijoic.log.LogManager

/**
 * Tag fix log manager.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
class TagFixLogManager internal constructor(
    private val tag: String, handler: LogHandler): LogManager(handler) {
  /**
   * Send a VERBOSE log message.
   *
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun v(message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.VERBOSE, tag, message, error)
  }

  /**
   * Send a DEBUG log message.
   *
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun d(message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.DEBUG, tag, message, error)
  }

  /**
   * Send a INFO log message.
   *
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun i(message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.INFO, tag, message, error)
  }

  /**
   * Send a WARN log message.
   *
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun w(message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.WARN, tag, message, error)
  }

  /**
   * Send a ERROR log message.
   *
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun e(message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.ERROR, tag, message, error)
  }

  /**
   * Send a ASSERT log message.
   *
   * @param message message.
   * @param error error.
   */
  @JvmOverloads
  fun wtf(message: String, error: Throwable? = null) {
    dispatchLogMessage(Log.ASSERT, tag, message, error)
  }
}