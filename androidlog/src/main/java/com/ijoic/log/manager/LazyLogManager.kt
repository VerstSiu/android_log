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