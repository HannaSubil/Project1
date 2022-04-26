package com.hanna.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.hanna.myfirstapplication.R;

class GridViewApps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_apps);
        GridView apps = (GridView) findViewById(R.id.appsgrid);
        apps.setAdapter(new ImageAdapter(this));
        apps.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(GridViewApps.this,"Image Position"+position,Toast.LENGTH_SHORT).show();

            }
        });

    }
}