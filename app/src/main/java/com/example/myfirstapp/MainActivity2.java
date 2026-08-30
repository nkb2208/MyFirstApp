package com.example.myfirstapp;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = findViewById(R.id.btnDone);

        btn1.setOnClickListener(ReturnPage);
    }

    View.OnClickListener ReturnPage = new View.OnClickListener(){
        public void onClick(View v){
            Intent thuKichHoatMH1;
            thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(thuKichHoatMH1);
        }
    };
}
