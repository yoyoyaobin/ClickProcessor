package com.hyb.clickprocessor;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * 类描述：
 * 创建人：huangyaobin
 * 创建时间：2019/12/12
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class LoginActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.MATCH_PARENT));
        TextView tv = new TextView(this);
        tv.setText("loginActivity");
        linearLayout.addView(tv);
        setContentView(linearLayout);
    }
}
