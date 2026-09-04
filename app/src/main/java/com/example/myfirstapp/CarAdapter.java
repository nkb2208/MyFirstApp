package com.example.myfirstapp;

import static java.security.AccessController.getContext;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.ActivityChooserView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Map;

public class CarAdapter extends BaseExpandableListAdapter {
    private ArrayList<CarGroup> carGroupLst;

    private Map<CarGroup, ArrayList<CarItem>> carItemsLst;

    public CarAdapter( ArrayList<CarGroup> carGroupLst ,Map<CarGroup, ArrayList<CarItem>> carItemsLst) {
        this.carItemsLst = carItemsLst;
        this.carGroupLst = carGroupLst;
    }

    @Override
    public Object getChild(int i, int i1) {
        return carItemsLst.get(carGroupLst.get(i)).get(i1);
    }

    @Override
    public long getChildId(int i, int i1) {
        return carItemsLst.get(carGroupLst.get(i)).get(i1).getId();
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        CarItem carItemLst = carItemsLst.get(carGroupLst.get(i)).get(i1);
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_car_item, viewGroup, false);
        }
        TextView tv = (TextView) view.findViewById(R.id.carItemsTxt);
        ImageView iv = (ImageView) view.findViewById(R.id.carItemImg);

        tv.setText(carItemLst.getName());
        iv.setImageResource(carItemLst.getImg());

        return view;
    }

    @Override
    public int getChildrenCount(int i) {
        if(carGroupLst != null && carItemsLst != null){
            return carItemsLst.get(carGroupLst.get(i)).size();
        }
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return carGroupLst.get(i);
    }

    @Override
    public int getGroupCount() {
        if(carGroupLst != null){
            return carGroupLst.size();
        }
        return 0;
    }

    @Override
    public long getGroupId(int i) {
        return carGroupLst.get(i).getId();
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        CarGroup carGrpLst = carGroupLst.get(i);
        if(view  == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_car_group, viewGroup, false);
        }

        TextView tv = (TextView) view.findViewById(R.id.carGroupTxt);
        ImageView iv = (ImageView) view.findViewById(R.id.carGroupImg);

        tv.setText(carGrpLst.getName());
        iv.setImageResource(carGrpLst.getImg());

        return view;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
