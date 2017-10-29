package com.example.hometest;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 晓波 on 2017/10/16.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText editText1 = (EditText) findViewById(R.id.login_username);
        EditText editText2 = (EditText) findViewById(R.id.login_password);
        Drawable drawable1 = getResources().getDrawable(R.drawable.head);
        Drawable drawable2 = getResources().getDrawable(R.drawable.password);
        drawable1.setBounds(10, 5, 60, 60);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        drawable2.setBounds(10, 5, 60, 60);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        editText1.setCompoundDrawables(drawable1, null, null, null);//只放左边
        editText2.setCompoundDrawables(drawable2, null, null, null);//只放左边

        TextView registe = (TextView) findViewById(R.id.login_registe);
        registe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        Button btn = (Button) findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });

        TextView fgt = (TextView) findViewById(R.id.login_forget);
        fgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,ForgetActivity.class));
            }
        });

    }
}
