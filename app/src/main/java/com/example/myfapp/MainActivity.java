package com.example.myfapp;                                 //指定包

import android.support.v7.app.AppCompatActivity;            //导入Support v7库中的AppCompatActivity类
import android.os.Bundle;                                   //导入Bundle类

public class MainActivity extends AppCompatActivity {       //对Activity执行初始化

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
