package com.hanna.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    TextView user;
    Intent i;
    ArrayList stars=new ArrayList();
    ArrayAdapter arrayobj;
    ListView lv_stars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        user = (TextView) findViewById(R.id.welcomelabel);
        i = getIntent();
        String username = i.getStringExtra("user");
        user.setText("Welocome "+username);
        user.setAllCaps(true);
        lv_stars=(ListView)findViewById(R.id.list_stars);
        stars.add("Sun");
        stars.add("Mercury");
        stars.add("Venus");
        stars.add("Earth");
        stars.add("mars");
        stars.add("Jupiter");
        stars.add("Saturn");
        stars.add("Kozhikkod");
        stars.add("Uranus");
        stars.add("Neptune");

        arrayobj=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,stars);
        lv_stars.setAdapter(arrayobj);
        lv_stars.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"selecte district is "+ stars.get(i),Toast.LENGTH_LONG).show();
            }
        });



    }
}