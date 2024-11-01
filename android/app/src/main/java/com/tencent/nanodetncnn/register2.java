package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class register2 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register2);
        Button Button1 = (Button) this.findViewById(R.id.user1_btn);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(register2.this,Menu.class);
                startActivity(intent);

            }
        });

        Button signupButton = (Button) this.findViewById(R.id.signup_btn);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(register2.this,"Succeed!",Toast.LENGTH_SHORT);
                Intent intent=new Intent(register2.this,Menu.class);
                startActivity(intent);

            }
        });

}}
