package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommonDiseases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_diseases);
        Button cut = findViewById(R.id.homeBtnCommonDisease);
        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommonDiseases.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}