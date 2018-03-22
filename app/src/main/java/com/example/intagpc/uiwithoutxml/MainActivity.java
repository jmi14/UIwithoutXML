package com.example.intagpc.uiwithoutxml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(MainActivity.this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        EditText etEmail = new EditText(this);
        etEmail.setHint("Email");
        ViewGroup.LayoutParams etEmailParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        etEmail.setLayoutParams(etEmailParams);

        EditText etPassword = new EditText(this);
        etPassword.setHint("Password");
        ViewGroup.LayoutParams etPasswordParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        etPassword.setLayoutParams(etPasswordParams);

        Button btnLogin = new Button(MainActivity.this);
        btnLogin.setText("Login");
        btnLogin.setBackgroundColor(Color.BLUE);
        ViewGroup.LayoutParams btnLayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnLogin.setLayoutParams(btnLayoutParams);

        linearLayout.addView(etEmail);
        linearLayout.addView(etPassword);
        linearLayout.addView(btnLogin);
        setContentView(linearLayout);
    }
}
