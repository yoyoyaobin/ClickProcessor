package com.hyb.clickprocessor

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.hyb.aspectlibrary.Aspect
import com.hyb.aspectlibrary.OnAspectListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Aspect.init().setClickDelayTime(500).setOnAspectListener(object : OnAspectListener {
            override fun aspect(view: View): Boolean {
                //可以在这里写一些项目里需要统一处理的逻辑，比如判断网络，是否已登录等
                //返回true则事件继续传递，false则不会传递事件
                Log.i("tag" , "拦截view:${view.id}")
                if(view.id == R.id.btn_open){
                    startActivity(Intent(this@MainActivity , LoginActivity().javaClass))
                }
                return true
            }
        })

        btn.setOnClickListener {
            startActivity(Intent(this@MainActivity , SecondActivity().javaClass))
        }

        tv.setOnClickListener {
            tv.text = (tv.text.toString().toInt() + 1).toString()
        }
    }
}