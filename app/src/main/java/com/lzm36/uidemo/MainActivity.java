package com.lzm36.uidemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取按钮
        Button button = findViewById(R.id.button1);

        //按钮进行监听
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"上传图片",Toast.LENGTH_SHORT).show();
                //监听按钮，如果点击，就跳转
//                Intent intent = new Intent();
//                //前一个（MainActivity.this）是目前页面，后面一个是要跳转的下一个页面
//                intent.setClass(MainActivity.this, Sencond.class);
                startActivity(new Intent(MainActivity.this, Sencond.class));
            }
        });
    }
}

