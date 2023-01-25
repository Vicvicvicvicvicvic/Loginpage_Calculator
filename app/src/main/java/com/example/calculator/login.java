package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton signinbtn = (MaterialButton) findViewById(R.id.signinbtn);

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(login.this, "Login in Successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this, MainActivity.class));
                }
                else {
                    Toast.makeText(login.this, "Login in Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}