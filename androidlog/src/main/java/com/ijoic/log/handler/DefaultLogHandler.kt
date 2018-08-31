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
package com.ijoic.log.handler

import android.util.Log
import com.ijoic.log.LogHandler

/**
 * Default log handler.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
internal object DefaultLogHandler: LogHandler {
  override fun dispatch(level: Int, tag: String, message: String, error: Throwable?) {
    when(level) {
      Log.VERBOSE -> Log.v(tag, message, error)
      Log.DEBUG -> Log.d(tag, message, error)
      Log.INFO -> Log.i(tag, message, error)
      Log.WARN -> Log.w(tag, message, error)
      Log.ERROR -> Log.e(tag, message, error)
      Log.ASSERT -> Log.wtf(tag, message, error)
    }
  }

}