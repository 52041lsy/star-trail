package com.tencent.nanodetncnn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {

    private EditText usernameEditText;
    private EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);

        //绑定界面原件
        usernameEditText = findViewById(R.id.login_input_username);
        passwordEditText = findViewById(R.id.login_input_password);
        Button loginButton = (Button) this.findViewById(R.id.login_btn);
        Button registerButton = (Button) this.findViewById(R.id.signup_btn);
        //登录按钮监听器
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a=usernameEditText.getText().toString();
                String b=passwordEditText.getText().toString();

                if (a.equals("suzy")) {
                    Toast.makeText(Login.this, "Welcome!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, Menu.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, a+b+"Wrong password!", Toast.LENGTH_SHORT).show();
                }
                //login(a,b);
            }
        });
        //注册按钮监听器
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,reegister1.class);
                startActivity(intent);
            }
        });
    }}
/*
    //登录功能实现
    protected void login(String a ,String b) {

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://192.168.45.1:8080/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        ApiService.Login service=retrofit.create(ApiService.Login.class);
        Call<User> call=service.toLogin(a);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.body()!=null){
                    if(response.body().getPassword().equals(b)){
                        Toast.makeText(MainActivity.this,"Welcome!",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity.this,Locate.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Wrong password!",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Your id no exist!",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this,a+","+b+","+"Fail to connect",Toast.LENGTH_SHORT).show();
            }
        });*/


