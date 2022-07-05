package com.kelin.logger

/**
 * **描述:** 日志工具。
 *
 * **创建人:** kelin
 *
 * **创建时间:** 2022/7/5 2:27 PM
 *
 * **版本:** v 1.0.0
 */
object Logger {
    private var sCurDeveloperName: String = ""
    private var sIsDebug = true
    private var sIsFilterOtherDeveloperLog = true

    /**
     * 初始化函数。需要在Application启动的时候进行初始化。
     *
     * @param developerName           开发者名称，也是电脑名称。如果你的电脑没有设置过名称请设置一下。
     * @param isDebugMode             当前是否是debug模式。
     * @param filterOtherDeveloperLog 是否过滤其他开发者日志，如果为true表示你讲看不到其他开发者的日志，false则可以。默认为true。
     */
    fun init(
        developerName: String,
        isDebugMode: Boolean,
        filterOtherDeveloperLog: Boolean = true
    ) {
        sCurDeveloperName = developerName
        sIsDebug = isDebugMode
        sIsFilterOtherDeveloperLog = filterOtherDeveloperLog
    }

    /**
     * 获取某个开发者的日志。
     */
    fun developer(developer: Developer, tag: String? = null, showThread: Boolean = false): Log? {
        return if (sIsDebug && (developer.devName == sCurDeveloperName || !sIsFilterOtherDeveloperLog)) {
            UserLogger(tag, developer, showThread)
        } else {
            null
        }
    }

    /**
     * 获取系统日志。
     */
    fun system(tag: String? = null, showThread: Boolean = false): Log? {
        return if (sIsDebug) SystemLogger(tag, showThread) else null
    }
}