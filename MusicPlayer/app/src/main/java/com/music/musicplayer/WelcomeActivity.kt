package com.music.musicplayer

import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        //匿名类部类
        mTimer.schedule(object : TimerTask(){
            override fun run() {
                Log.e("welcomeActivity", "当前线程为：${Thread.currentThread()}")
                toMain()
            }
        }  , 3000)
    }

    fun toMain(){
        //启动activity
        var intent = Intent(WelcomeActivity@this, MainActivity::class.java)
        //var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
