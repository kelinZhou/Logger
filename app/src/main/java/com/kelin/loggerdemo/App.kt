package com.kelin.loggerdemo

import android.app.Application
import com.kelin.logger.LogOption

/**
 * **描述:** 应用程序
 *
 * **创建人:** kelin
 *
 * **创建时间:** 2022/7/5 3:20 PM
 *
 * **版本:** v 1.0.0
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        LogOption.init(BuildConfig.DEVELOPER_NAME, false)
    }
}