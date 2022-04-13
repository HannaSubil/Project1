package com.hanna.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    TextView user;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        user = (TextView) findViewById(R.id.welcomelabel);
        i = getIntent();
        String username = i.getStringExtra("user");
        user.setText("Welocome "+username);
        user.setAllCaps(true);

    }
}