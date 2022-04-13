package com.hanna.myfirstapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity implements View.OnClickListener {

    TextView loginlabel;
    Button login;
    EditText un,pw;

    String username="admin";
    String password="12345";
    int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        login = (Button) findViewById(R.id.login);
        un=(EditText)findViewById(R.id.username);
        pw=(EditText)findViewById(R.id.password);
        loginlabel=(TextView)findViewById(R.id.loginpage);

    login.setOnClickListener((this));
           }
    @Override
    public void onClick(View view) {

        String uname=un.getText().toString();
        String pword=pw.getText().toString();

        if (username.equals(uname) && password.equals(pword)) {

            Intent i = new Intent(getApplicationContext(),HomePage.class);
            //passing username to Homepage through intent
            i.putExtra("user",uname);
            startActivity(i);

        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_LONG).show();
            count--;


                if(count == 0){

                    login.setEnabled(false); //disabling the Button
                    loginlabel.setText("LOGIN BLOCKED");
                    loginlabel.setTextColor(Color.RED);

            }
        }


      }

    }