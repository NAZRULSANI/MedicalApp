package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SetAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm);
        Button home = findViewById(R.id.homeBtnSetAlarm);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetAlarm.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button alarm = findViewById(R.id.setAlarmBtn);
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SetAlarm.this, "The alarm has been added", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SetAlarm.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}