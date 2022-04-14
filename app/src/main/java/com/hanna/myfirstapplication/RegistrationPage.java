package com.hanna.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationPage extends AppCompatActivity implements View.OnClickListener {

    Button register;
    EditText name,age,place,uname,pword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        register=(Button) findViewById(R.id.submit_button);
        name=(EditText)findViewById(R.id.nametext) ;
        age=(EditText)findViewById(R.id.agetext) ;
        place=(EditText)findViewById(R.id.placetext) ;
        uname=(EditText)findViewById(R.id.usernametext) ;
        pword=(EditText)findViewById(R.id.passwodtext) ;
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (name.getText().toString().matches("") || age.getText().toString().matches("") || place.getText().toString().matches("") ||uname.getText().toString().matches("") || pword.getText().toString().matches(""))
        {
            Toast.makeText(getApplicationContext(),"Please Fill All Fields",Toast.LENGTH_LONG).show();



        }
        else{
            String un=uname.getText().toString();
            String pw=pword.getText().toString();
            Intent i = new Intent(getApplicationContext(),loginpage.class);
            i.putExtra("user",un);
            i.putExtra("password",pw);
            startActivity(i);

        }


    }
}