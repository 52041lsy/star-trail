package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class reegister1  extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register1);
        Button returnButton = (Button) this.findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(reegister1.this,Login.class);
                startActivity(intent);

            }
        });

        Button signupButton = (Button) this.findViewById(R.id.signup_btn);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(reegister1.this,"Succeed!",Toast.LENGTH_SHORT);
                Intent intent=new Intent(reegister1.this,register2.class);
                startActivity(intent);

            }
        });

}}
