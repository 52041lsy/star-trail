package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class ChooseType extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.type);
        Button Button1 = (Button) this.findViewById(R.id.user1_btn);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChooseType.this,Main.class);
                startActivity(intent);
                //TODO:向数据库写入用户类型

            }
        });

        Button signupButton = (Button) this.findViewById(R.id.signup_btn);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChooseType.this,"Succeed!",Toast.LENGTH_SHORT);
                Intent intent=new Intent(ChooseType.this,Main2.class);
                startActivity(intent);
                //TODO:向数据库写入用户类型

            }
        });

}}
