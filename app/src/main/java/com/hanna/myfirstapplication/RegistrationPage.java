package com.hanna.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistrationPage extends AppCompatActivity implements View.OnClickListener {

    Button register;
    EditText name, age, place, uname, pword;
    RadioGroup gender;
    RadioButton rid;
    CheckBox ch_mal, ch_eng, ch_hin, ch_tam;
    Spinner sp_state;
    String value="";
String state[]={"-Select state-","Kerala","Tamil Nadu","Karnataka","Goa","Andra Pradesh","Arunachal Pradesh","Gujarat","Rajastan","Punjab"};
    ArrayAdapter arrayAdapterobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        register = (Button) findViewById(R.id.submit_button);
        name = (EditText) findViewById(R.id.nametext);
        age = (EditText) findViewById(R.id.agetext);
        place = (EditText) findViewById(R.id.placetext);
        uname = (EditText) findViewById(R.id.usernametext);
        pword = (EditText) findViewById(R.id.passwodtext);
        gender = (RadioGroup) findViewById(R.id.rg_gender);


        ch_mal = (CheckBox) findViewById(R.id.ch_malayalam);
        ch_eng = (CheckBox) findViewById(R.id.ch_english);
        ch_hin = (CheckBox) findViewById(R.id.ch_hindi);
        ch_tam = (CheckBox) findViewById(R.id.ch_tamil);
        rid = (RadioButton) findViewById(gender.getCheckedRadioButtonId());

        sp_state=(Spinner)findViewById(R.id.statespinner);
        arrayAdapterobj=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,state);
        sp_state.setAdapter(arrayAdapterobj);


        sp_state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).equals("-Select state-")){}
                else{
                Toast.makeText(getApplicationContext(),"selecte State is "+state[i],Toast.LENGTH_LONG).show();
            }}

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        //   @Override
        //  public void onCheckedChanged(RadioGroup radioGroup, int i) {

        //     RadioButton rid=(RadioButton) findViewById(gender.getCheckedRadioButtonId());
        //     String value=rid.getText().toString();
        //     Toast.makeText(getApplicationContext(),"Selected Gender is "+value,Toast.LENGTH_LONG).show();

        // }
        // });


        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        String langg="";



        if (name.getText().toString().matches("") || age.getText().toString().matches("") || place.getText().toString().matches("") || uname.getText().toString().matches("") || pword.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please Fill All Fields", Toast.LENGTH_SHORT).show();

            if(ch_mal.isChecked()){
                langg+="\nMalayalam";
            }
            if(ch_eng.isChecked()){
                langg+="\nEnglish";
            }
            if(ch_hin.isChecked()){
                langg+="\nHindi";
            }
            if(ch_tam.isChecked()){
                langg+="\nTamil";
            }

            Toast.makeText(getApplicationContext(), "Selected Gender is " + value, Toast.LENGTH_SHORT).show();

            Toast.makeText(getApplicationContext(),"Selected Languages are "+langg,Toast.LENGTH_SHORT).show();

        }
        else {


            String un = uname.getText().toString();
            String pw = pword.getText().toString();
            Intent i = new Intent(getApplicationContext(), loginpage.class);
            i.putExtra("user", un);
            i.putExtra("password", pw);
            startActivity(i);

        }


    }
}