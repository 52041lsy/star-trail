package com.tencent.nanodetncnn;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Main extends FragmentActivity {
    private Fragment HomePage = new HomeFragment();
    private Fragment CallPage = new CallFragment();
    private Fragment SetPage = new UserFragment();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, HomePage)
                    .addToBackStack(null) // 添加到回退栈
                    .commit();
        }

        Button ToHome = findViewById(R.id.funca);
        ToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, HomePage)
                        .commit();
            }
        });


        Button ToCall = findViewById(R.id.funcb);
        ToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, CallPage)
                        .commit();
            }
        });


        Button ToSet = findViewById(R.id.funcd);
        ToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, SetPage)
                        .commit();
            }
        });
    }
/*
    public void onBackPressed() {
        if (getSupportFragmentManager().popBackStackImmediate()) {
            // 如果成功弹出回退栈，则不做其他操作
        } else {
            // 否则执行默认的返回操作
            super.onBackPressed();
        }
    }*/

}


