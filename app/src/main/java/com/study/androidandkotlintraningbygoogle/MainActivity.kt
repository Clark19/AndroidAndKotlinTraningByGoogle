package com.study.androidandkotlintraningbygoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(appNum: Int) {
        goApp(appNum)
    }

    fun goApp(appNum: Int) {
        // go Module
        when {

        }
    }

}