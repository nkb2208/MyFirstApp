package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenMH2(View v){
        Intent chuyenManHinh2;
        chuyenManHinh2 = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(chuyenManHinh2);
    }
}