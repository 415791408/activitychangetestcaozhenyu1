package com.example.administrator.activitychangetestcaozhenyu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mybutton = (Button)findViewById(R.id.myBtn01);
        //设置mybutton的按键监听器
        mybutton.setOnClickListener(new BtnListener());
    }

    class BtnListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            //新建一个Intent对象
            Intent intent =new Intent();
            //指定intent要启动的类
            intent.setClass(SecondActivity.this,MainActivity.class);
            startActivity(intent);
            //关闭当前Activity
            //finish();
        }
    }
}