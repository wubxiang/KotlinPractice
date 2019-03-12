package com.example.wbx.kotlinepractice1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.text = "你好呀"

        btn1.setOnClickListener{
            btn1.text = "您点了一下"
            toast("小提示：您点了一下下")
        }

        btn1.setOnLongClickListener {
            btn1.text = "您长按了一小会"
            longToast("小提示：您长按了一小会")
            ;true
        }
    }
}
