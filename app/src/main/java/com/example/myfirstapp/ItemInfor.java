package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemInfor extends AppCompatActivity {
    private Car selectedCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_infor);

        getSelectedCar();
        setValues();
    }

    public void chuyenMHHome(View v){
        Intent thuChuyenMHHome;
        thuChuyenMHHome = new Intent(ItemInfor.this, Home_Screen.class);
        startActivity(thuChuyenMHHome);
    }

    private void getSelectedCar(){
        Intent previousIntent = getIntent();
        String parsedStringId= previousIntent.getStringExtra("id");
        selectedCar = Home_Screen.carsLst.get(Integer.valueOf(parsedStringId));
    }

    private  void setValues(){
        TextView tv = (TextView) findViewById(R.id.carNameInfo);
        ImageView iv = (ImageView) findViewById(R.id.carImageInfo );

        tv.setText(selectedCar.getNameCar());
        iv.setImageResource(selectedCar.getImage());
    }

}