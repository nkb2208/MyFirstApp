package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void chuyenTrangDangNhap(View v){
        Intent thuChuyenMHDN;
        thuChuyenMHDN = new Intent(Home_Screen.this, MainActivity2.class);
        startActivity(thuChuyenMHDN);
    }
}