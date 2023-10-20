package com.lzm36.uidemo;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sencond extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //这个是获取布局文件的，这里是你下一个页面的布局文件//注意这个是跳转界面的不能设置错，应该是第一个
        setContentView(R.layout.sencond);
        Button button = findViewById(R.id.button2);
        EditText textsc=findViewById(R.id.textsc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(textsc.getText().toString().trim())){
                    Toast.makeText(Sencond.this,"请输入链接标题",Toast.LENGTH_SHORT).show();
                }else {
                    //监听按钮，如果点击，就跳转
                    /*Intent intent = new Intent();
                    //前一个（Sencond.this）是目前页面，后面一个是要跳转的下一个页面
                    intent.setClass(Sencond.this, Third.class);*/
                    startActivity(new Intent(Sencond.this, Third.class));

                }



            }
        });
    }



    //按钮进行监听

}

