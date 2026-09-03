package com.example.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Car> {
    public ItemAdapter(Context context, int resource, ArrayList<Car> carLst){
        super(context,resource, carLst);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        Car car = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_my_list_item, parent,false);

        }

        TextView tv = (TextView) convertView.findViewById(R.id.carName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.carImages );

        tv.setText(car.getNameCar());
        iv.setImageResource(car.getImage());

        return convertView;
    }
}
