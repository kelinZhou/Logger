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
internal class UserLogger(private var tag: String?, private var developer: Developer, private var showThreadInfo: Boolean) : Log {

    override val showThread: Boolean
        get() = showThreadInfo

    override val realTag: String
        get() = if (tag.isNullOrBlank()) {
            "[${developer.tag}]"
        } else {
            "$tag   [${developer.tag}]"
        }

    internal fun update(tag: String?, developer: Developer, showThreadInfo: Boolean) {
        this.tag = tag
        this.developer = developer
        this.showThreadInfo = showThreadInfo
    }
}