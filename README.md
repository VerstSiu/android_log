
# Android Log

[![](https://jitpack.io/v/VerstSiu/android_log.svg)](https://jitpack.io/#VerstSiu/android_log)

Support lazy generate log message. And prevent log output for release applications.

See also:

* [VerstSiu/flag_bus](https://github.com/VerstSiu/flag_bus)

## Get Start

1. Add `jitpack` repository to root `build.gradle`:

    ```gradle
    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
    ```

2. Add library dependency to project's `build.gradle`:

    ```gradle
    dependencies {
        implementation 'com.github.VerstSiu:android_log:1.0'
    }
    ```

## Usage

1. Use from log manager factory:

    ```kotlin
    val log = LogManagerFactory.simple()
 
    log.i("test_message", "Hello World!")
    ```

2. Use from common:

    ```kotlin
    val log = SimpleLog
    
    log.i("test_message", "Hello World!")
    ```

3. Customize log handler:

    ```kotlin
    val handler = object: LogHandler {
      override fun dispatch(level: Int, tag: String, message: String, error: Throwable?) {
        println(message)
      }
    }
    val log = LogManagerFactory.simple(handler)
 
    log.i("test_message", "Hello World!")
    ```

4. Trim text contents:

    ```kotlin
    log.i("http", "response text: ${responseText.trimLimit(300)}")
    ```

## API List

* Log handler:

    ```kotlin
    interface LogHandler {
      fun dispatch(level: Int, tag: String, message: String, error: Throwable?)
    }
    ```

* Simple log manager:

    ```kotlin
    class SimpleLogManager {
      fun v(tag: String, message: String[, error: Throwable?])
      fun d(tag: String, message: String[, error: Throwable?])
      fun i(tag: String, message: String[, error: Throwable?])
      fun w(tag: String, message: String[, error: Throwable?])
      fun e(tag: String, message: String[, error: Throwable?])
      fun wtf(tag: String, message: String[, error: Throwable?])
    }
    ```

* Tag fix log manager:

    ```kotlin
    class TagFixLogManager {
      fun v(message: String[, error: Throwable?])
      fun d(message: String[, error: Throwable?])
      fun i(message: String[, error: Throwable?])
      fun w(message: String[, error: Throwable?])
      fun e(message: String[, error: Throwable?])
      fun wtf(message: String[, error: Throwable?])
    }
    ```

* Lazy log manager:

    ```kotlin
    class LazyLogManager {
      fun v(tag: String, [error: Throwable?, ]getMessage: () -> String)
      fun d(tag: String, [error: Throwable?, ]getMessage: () -> String)
      fun i(tag: String, [error: Throwable?, ]getMessage: () -> String)
      fun w(tag: String, [error: Throwable?, ]getMessage: () -> String)
      fun e(tag: String, [error: Throwable?, ]getMessage: () -> String)
      fun wtf(tag: String, [error: Throwable?, ]getMessage: () -> String)
    }
    ```

* Tag fix lazy log manager:

    ```kotlin
    class TagFixLazyLogManager {
      fun v([error: Throwable?, ]getMessage: () -> String)
      fun d([error: Throwable?, ]getMessage: () -> String)
      fun i([error: Throwable?, ]getMessage: () -> String)
      fun w([error: Throwable?, ]getMessage: () -> String)
      fun e([error: Throwable?, ]getMessage: () -> String)
      fun wtf([error: Throwable?, ]getMessage: () -> String)
    }
    ```

* Log manager factory:

    ```kotlin
    object LogManagerFactory {
      fun simple([handler: LogHandler]): SimpleLogManager
      fun simple(tag: String[, handler: LogHandler]): TagFixLogManager
      fun lazy([handler: LogHandler]): LazyLogManager
      fun lazy(tag: String[, handler: LogHandler]): TagFixLazyLogManager
    }
    ```

* Common log manager:

    ```kotlin
    object SimpleLog: SimpleLogManager
    object LazyLog: LazyLogManager
    ```

* Extend methods:

    ```kotlin
    fun String.trimLimit(length: Int): String
    ```

## License

```

   Copyright(c) 2018 VerstSiu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

```
