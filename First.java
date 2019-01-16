package com.example.arjun.newpro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class First extends AppCompatActivity {
EditText editText,editText2;
Button button;
String gend;
RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editText=(EditText) findViewById(R.id.idname);
        editText2=(EditText) findViewById(R.id.idpass);
        button=(Button) findViewById(R.id.idsubm);
        radioGroup=findViewById(R.id.gender);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rd = (RadioButton) findViewById(checkedId);
                String gender=rd.getText().toString();
                gend=gender;
            }


        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().matches("")&&editText2.getText().toString().matches("")) {
                    Toast.makeText(First.this,"Please fill both fields to continue",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    final String messageshow = "Welcome Mr. " + editText.getText().toString() + " . Your Password is " + editText2.getText().toString()+". You are a "+gend;
                    Toast.makeText(First.this, messageshow, Toast.LENGTH_SHORT).show();
                    //Intent intent=new Intent(First.this,displaydata.class);
                    //startActivity(intent);
                }
            }
        });
    }
}
