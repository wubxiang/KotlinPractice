package com.music.musicplayer

import android.os.Bundle

class MainActivity : BaseActivity() {

    init {
        println("MainActivity: 类的初始化函数")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("MainActivity: oncreate()")
    }
}
