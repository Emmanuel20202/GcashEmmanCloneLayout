package com.example.gcashemmanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    Button b1;
    EditText ed1,ed2,ed3,ed4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.edit1);
        ed2 = (EditText)findViewById(R.id.edit2);
        ed3 = (EditText)findViewById(R.id.edit3);
        ed4 = (EditText)findViewById(R.id.edit4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("1") && ed2.getText().toString().equals("2") && ed3.getText().toString().equals("3") && ed4.getText().toString().equals("4")) {
                    Toast.makeText(getApplicationContext(), "Log in successful Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogInActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                    }
                }

        });
    }
}