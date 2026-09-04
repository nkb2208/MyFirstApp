package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home_Screen extends AppCompatActivity {
    public static ArrayList<Car> carsLst = new ArrayList<Car>();

    private ListView listView;

    private Spinner spinner;
    private LanguageAdapter languageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // data
        ArrayList<String> data = new ArrayList<>();
        for(int i = 1; i< 6; i++){
            data.add("item " + i);
        }

        //     ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                data
//        );
//        ListView listView = findViewById(R.id.lstItems);
//        listView.setAdapter(adapter);

        //Custom view list
//        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(
//                this,
//                R.layout.activity_my_list_item,
//                R.id.textView2,
//                data
//        );
//        ListView lstView = findViewById(R.id.lstItem1);
//        lstView.setAdapter(adapter1);

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

        setUpData();
        setUpAdapter();
        setUpOnClickListener();

        // Basic Spinner
//        ArrayList<String> dataProvider = new ArrayList<>();
//        dataProvider.add("HCMC");
//        dataProvider.add("Vung Tau");
//        dataProvider.add("Can Tho");
//        dataProvider.add("Ha Noi");
//
//        Spinner spinner = (Spinner) findViewById(R.id.languageLst);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                dataProvider
//        );
//        spinner.setAdapter(adapter);

        ArrayList<Language> languagesLst = new ArrayList<>();
        languagesLst.add(new Language("0", "C++", R.drawable.c));
        languagesLst.add(new Language("1", "Java", R.drawable.java));
        languagesLst.add(new Language("2", "Python", R.drawable.python));

        spinner = (Spinner) findViewById(R.id.languageLst);
        languageAdapter = new LanguageAdapter(Home_Screen.this, R.layout.activity_my_list_item, languagesLst);
        spinner.setAdapter(languageAdapter);
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

    private void setUpData(){
        Car mercedes = new Car("0", "Mercedes", R.drawable.mercedes );
        Car bmw = new Car("1", "BMW", R.drawable.bmw );
        Car audi = new Car("2", "Audi", R.drawable.audi );
        carsLst.add(mercedes);
        carsLst.add(bmw);
        carsLst.add(audi);
    }

    private void setUpAdapter(){
        listView = (ListView) findViewById(R.id.carsListView);

        ItemAdapter adapter = new ItemAdapter(Home_Screen.this, 0,carsLst);

        listView.setAdapter(adapter);
    }

    private void setUpOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Car selectedCar = (Car) (listView.getItemAtPosition(i));
                Intent thuChuyenDetail;
                thuChuyenDetail = new Intent(Home_Screen.this, ItemInfor.class);
                thuChuyenDetail.putExtra("id",selectedCar.getId());
                startActivity(thuChuyenDetail);
            }
        });
    }
}