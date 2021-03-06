package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstAid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        Button home  = findViewById(R.id.homeBtnFirst);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstAid.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button cut = findViewById(R.id.cutBtn);
        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstAid.this, Cut.class);
                startActivity(intent);
            }
        });
        Button burn = findViewById(R.id.burnBtn);
        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstAid.this, Burn.class);
                startActivity(intent);
            }
        });
        Button common = findViewById(R.id.commonBtn);
        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstAid.this, CommonDiseases.class);
                startActivity(intent);
            }
        });

    }
}