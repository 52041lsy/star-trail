package com.tencent.nanodetncnn;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;


import android.support.annotation.Nullable;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends Activity {
    private static final int REQUEST_CALL_PERMISSION = 1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu);

        Button funcD= this.findViewById(R.id.funcD);
        funcD.setOnClickListener(v -> {
            Intent intent=new Intent(Menu.this,Menu2.class);
            startActivity(intent);
        });

        Button funcC=this.findViewById(R.id.funcC);
        funcC.setOnClickListener(v -> {
            Toast.makeText(Menu.this," FunC",Toast.LENGTH_SHORT).show();

            makePhoneCall();
        });

        Button funcE=this.findViewById(R.id.funcE);
        funcE.setOnClickListener(v -> {
            Toast.makeText(Menu.this," FunE",Toast.LENGTH_SHORT).show();
            /*Intent intent=new Intent(Menu.this,Detect.class);
            startActivity(intent);*/
        });

    }





    //打电话
    private void makePhoneCall() {
        String phoneNumber ="83497886";
        if (phoneNumber.trim().isEmpty()) {
            Toast.makeText(Menu.this, "NONE!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (ContextCompat.checkSelfPermission(Menu.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Menu.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL_PERMISSION);
        } else {
            String dial = "tel:" + phoneNumber;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }
}
