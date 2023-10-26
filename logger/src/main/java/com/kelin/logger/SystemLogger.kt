package com.kelin.logger

/**
 * **描述:** 系统日志
 *
 * **创建人:** kelin
 *
 * **创建时间:** 2022/7/5 2:37 PM
 *
 * **版本:** v 1.0.0
 */
internal class SystemLogger(private var tag: String?, private var showThreadInfo: Boolean) : Log {

    override val showThread: Boolean
        get() = showThreadInfo

    override val realTag: String
        get() = if (tag.isNullOrBlank()) {
            "[+@System@]"
        } else {
            "$tag   [+@System@]"
        }

    internal fun update(tag: String?, showThreadInfo: Boolean) {
        this.tag = tag
        this.showThreadInfo = showThreadInfo
    }
}