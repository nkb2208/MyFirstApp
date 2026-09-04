package com.example.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class LanguageAdapter extends ArrayAdapter<Language> {
    public LanguageAdapter(Context context, int resource, ArrayList<Language> languagesLst){
        super(context, resource, languagesLst);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Language language = getItem(position);

        if(convertView == null ){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_my_list_item,parent, false);
        }

        TextView tw = (TextView) convertView.findViewById(R.id.carName);
        ImageView iw = (ImageView) convertView.findViewById(R.id.carImages);


        tw.setText(language.getLanguageName());
        iw.setImageResource(language.getImage());

        return convertView;
    }

    @Override
    public View getDropDownView(int position,  View convertView,  ViewGroup parent) {
        return getView(position,convertView,parent);
    }

}
