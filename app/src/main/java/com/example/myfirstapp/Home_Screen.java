package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Home_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // data
        ArrayList<String> data = new ArrayList<>();
        for(int i = 1; i< 6; i++){
            data.add("item " + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                data
        );
        ListView listView = findViewById(R.id.lstItems);
        listView.setAdapter(adapter);

        //Custom view list
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(
                this,
                R.layout.activity_my_list_item,
                R.id.textView2,
                data
        );
        ListView lstView = findViewById(R.id.lstItem1);
        lstView.setAdapter(adapter1);

        // Inflate
        // Method 1:
//        ViewGroup root = (ViewGroup)findViewById(R.id.main);
//
//        LayoutInflater inflater = getLayoutInflater();
//
//        View childView = inflater.inflate(R.layout.activity_my_list_item,root);


        // Method 2:
//        View childView1 = inflater.inflate(R.layout.activity_my_list_item, null);
//        root.addView(childView1);
    }

    public String removeItem(ArrayList<String> data, int id ){
        String i = data.get(id);
        data.remove(id);
        return i;
    }

    public void chuyenTrangDangNhap(View v){
        Intent thuChuyenMHDN;
        thuChuyenMHDN = new Intent(Home_Screen.this, MainActivity2.class);
        startActivity(thuChuyenMHDN);
    }
}