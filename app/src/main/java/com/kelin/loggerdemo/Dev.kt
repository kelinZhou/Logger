package com.kelin.loggerdemo

import com.kelin.logger.Developer
import com.kelin.logger.Log
import com.kelin.logger.Logger

/**
 * **描述:** 开发者
 *
 * **创建人:** kelin
 *
 * **创建时间:** 2022/7/5 3:13 PM
 *
 * **版本:** v 1.0.0
 */
enum class Dev(override val devName: String, override val tag: String) : Developer {
    Kelin("kelin", "@Kelin@")
}

fun Dev.log(tag: String? = null, showThread: Boolean = false): Log? {
    return Logger.developer(this, tag, showThread)
}