package com.example.admincropinfohandling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisplayCropsToAdmin extends AppCompatActivity {

    Button change1 , change2 , add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_crops_to_admin);

        change1 = findViewById(R.id.btnInsertCrop);
        change2 = findViewById(R.id.btnChangeCrop2);
        add = findViewById(R.id.btnAddCrop);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAdd = new Intent(DisplayCropsToAdmin.this , MainActivity.class);
                startActivity(intentAdd);
            }
        });

        change1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intentChange1 = new Intent(DisplayCropsToAdmin.this , UpdateDeleteCrops.class);
                 startActivity(intentChange1);
            }
        });

        change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentChange2 = new Intent(DisplayCropsToAdmin.this , UpdateDeleteCrops.class);
                startActivity(intentChange2);
            }
        });

    }
}