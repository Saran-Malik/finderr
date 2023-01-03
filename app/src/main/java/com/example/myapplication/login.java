package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class login extends AppCompatActivity {

    Button mBtnLogin;
    TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mRegister = (TextView) findViewById(R.id.register);
        mBtnLogin = (Button)findViewById(R.id.btnLogin);



        //login button onclick listener
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(callLogin());

            }
        });
    }

    Intent callLogin(){
        Intent intent = new Intent(this, register.class);
        return intent;
    }
}