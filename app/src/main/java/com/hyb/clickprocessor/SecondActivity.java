package com.hyb.clickprocessor;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;


/**
 * 类描述：
 * 创建人：huangyaobin
 * 创建时间：2019/12/12
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button tv = findViewById(R.id.btn_open);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag" , "secondactivity click");
            }
        });

    }
}
