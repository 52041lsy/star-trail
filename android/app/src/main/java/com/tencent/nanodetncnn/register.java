package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class register extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register);
        Button returnButton = (Button) this.findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(register.this,Login.class);
                startActivity(intent);

            }
        });
        Button signupButton = (Button) this.findViewById(R.id.signup_btn);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO:向数据库中写入用户数据，实现注册功能
                Toast.makeText(register.this,"Succeed!",Toast.LENGTH_SHORT);
                Intent intent=new Intent(register.this, ChooseType.class);
                startActivity(intent);

            }
        });

}}
