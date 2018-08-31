package com.ijoic.log.export

import com.ijoic.log.handler.DefaultLogHandler
import com.ijoic.log.manager.SimpleLogManager

/**
 * Simple log.
 *
 * @author verstsiu on 2018/8/31
 * @version 1.0
 */
object SimpleLog: SimpleLogManager(DefaultLogHandler)