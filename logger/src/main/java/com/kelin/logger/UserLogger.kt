package com.kelin.logger

/**
 * **描述:** 用户日志
 *
 * **创建人:** kelin
 *
 * **创建时间:** 2022/7/5 2:37 PM
 *
 * **版本:** v 1.0.0
 */
class UserLogger(private val tag: String?, private val developer: Developer, override val showThread: Boolean) : Log {

    override val realTag: String
        get() = if (tag.isNullOrBlank()) {
            "[${developer.tag}]"
        } else {
            "$tag   [${developer.tag}]"
        }
}