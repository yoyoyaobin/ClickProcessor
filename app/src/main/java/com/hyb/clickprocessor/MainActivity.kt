package com.hyb.doubleclick

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hyb.aspectlibrary.Aspect
import com.hyb.aspectlibrary.OnAspectListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Aspect.init().setClickDelayTime(500).setOnAspectListener(object : OnAspectListener {
            override fun aspect(): Boolean {
                //可以在这里写一些项目里需要统一处理的逻辑，比如判断网络，是否已登录等
                //返回true则事件继续传递，false则不会传递事件
                return true
            }
        })


        tv.setOnClickListener {
            tv.text = (tv.text.toString().toInt() + 1).toString()
        }
    }
}