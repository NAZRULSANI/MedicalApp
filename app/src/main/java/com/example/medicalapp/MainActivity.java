package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button emergencyBtn,medicationBtn,faqBtn,firstaidBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emergencyBtn = findViewById(R.id.emergencyBtn);
        medicationBtn = findViewById(R.id.firstAidBtn);
        faqBtn = findViewById(R.id.faqBtn);
        firstaidBtn = findViewById(R.id.medicationBTn);

        emergencyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "911";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        firstaidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FirstAid.class);
                startActivity(intent);
            }
        });

        medicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Medication.class);
                startActivity(intent);
            }
        });
        faqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Faq.class);
                startActivity(intent);
            }
        });
    }
}