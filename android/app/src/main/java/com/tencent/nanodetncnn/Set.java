package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Set extends Activity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.personal);

        Button exit=this.findViewById(R.id.iv_back);
        exit.setOnClickListener(v -> {
            Intent intent=new Intent(Set.this,Main.class);
            startActivity(intent);
        });

    }


}
