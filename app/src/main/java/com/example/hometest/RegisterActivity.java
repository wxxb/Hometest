package com.example.hometest;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by 晓波 on 2017/10/18.
 */

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText editText1 = (EditText) findViewById(R.id.registe_tel);
        EditText editText2 = (EditText) findViewById(R.id.registe_username);
        EditText editText3 = (EditText) findViewById(R.id.registe_password);
        Drawable drawable1 = getResources().getDrawable(R.drawable.phone);
        Drawable drawable2 = getResources().getDrawable(R.drawable.head);
        Drawable drawable3 = getResources().getDrawable(R.drawable.password);
        drawable1.setBounds(10, 5, 60, 60);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        drawable2.setBounds(10, 5, 60, 60);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        drawable3.setBounds(10, 5, 60, 60);
        editText1.setCompoundDrawables(drawable1, null, null, null);//只放左边
        editText2.setCompoundDrawables(drawable2, null, null, null);//只放左边
        editText3.setCompoundDrawables(drawable3, null, null, null);//只放左边

    }
}
