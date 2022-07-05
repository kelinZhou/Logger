package com.kelin.logger

/**
 * **描述:** 日志
 *
 * **创建人:** kelin
 *
 * **创建时间:** 2022/7/5 2:29 PM
 *
 * **版本:** v 1.0.0
 */
interface Log {

    val showThread: Boolean

    val realTag: String

    fun getRealMsg(msg: String?): String {
        return if (showThread) {
            "${msg ?: ""}---Thread:${Thread.currentThread().name}"
        } else {
            msg ?: ""
        }
    }

    fun i(msg: String?, e: Throwable? = null) {
        android.util.Log.i(realTag, getRealMsg(msg), e)
    }

    fun d(msg: String?, e: Throwable? = null) {
        android.util.Log.d(realTag, getRealMsg(msg), e)
    }

    fun e(msg: String?, e: Throwable? = null) {
        android.util.Log.e(realTag, getRealMsg(msg), e)
    }

    fun v(msg: String?, e: Throwable? = null) {
        android.util.Log.v(realTag, getRealMsg(msg), e)
    }

    fun w(msg: String?, e: Throwable? = null) {
        android.util.Log.w(realTag, getRealMsg(msg), e)
    }

    fun wtf(msg: String?, e: Throwable? = null) {
        android.util.Log.wtf(realTag, getRealMsg(msg), e)
    }
}