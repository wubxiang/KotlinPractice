package com.music.musicplayer

import android.os.Bundle
import java.util.*

/**
 * 1、延迟3秒
 * 2、跳转页面
 */

class WelcomeActivity : BaseActivity() {
    var mTimer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        init()
    }

    fun init(){
        mTimer.schedule(object : TimerTask(){
            override fun run() {

            }
        }  , 3000)
    }
}