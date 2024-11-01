package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Menu2 extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu2);
        Button func1=(Button)this.findViewById(R.id.func1);
        func1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Menu2.this,Detect.class);
                startActivity(intent);
            }
        });

        Button func2=(Button)this.findViewById(R.id.func2);
        func2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(Menu2.this," Fun2",Toast.LENGTH_SHORT).show();
                /*Intent intent=new Intent(Menu2.this,Detect.class);
                startActivity(intent);*/
            }
        });

        Button func3=(Button)this.findViewById(R.id.func3);
        func3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(Menu2.this," Fun3",Toast.LENGTH_SHORT).show();
                /*Intent intent=new Intent(Menu2.this,Detect.class);
                startActivity(intent);*/
            }
        });

    }
}
