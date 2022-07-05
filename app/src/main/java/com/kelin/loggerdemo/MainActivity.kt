package com.kelin.loggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Dev.Kelin.log("MainActivity")?.i("onCreate:${run()}")
    }

    private fun run(): String {
        Log.d("MainActivity", "我真的运行了")
        return "我运行了"
    }
}