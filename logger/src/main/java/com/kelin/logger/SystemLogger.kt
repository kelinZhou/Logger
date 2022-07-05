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
class SystemLogger(private val tag: String?, override val showThread: Boolean) : Log {
    override val realTag: String
        get() = if (tag.isNullOrBlank()) {
            "[+@System@]"
        } else {
            "$tag   [+@System@]"
        }
}