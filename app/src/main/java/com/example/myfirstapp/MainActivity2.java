package com.example.myfirstapp;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button btn1;

    private EditText userNameInp;
    private EditText userPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = findViewById(R.id.btnDone);
        btn1.setOnClickListener(ReturnPage);

        userNameInp = findViewById(R.id.txtUserName);
        userPwd = findViewById(R.id.txtPwd);
    }

    public void chuyenTrangChu(View view){
        String username = userNameInp.getText().toString().toLowerCase().trim();
        String pwd = userPwd.getText().toString().toLowerCase().trim();
        if(username.equals("test") && pwd.equals("123456")){
            Intent thuChuyenTrangChu;
            thuChuyenTrangChu = new Intent(MainActivity2.this, Home_Screen.class);
            startActivity(thuChuyenTrangChu);
        }
        return;
    }

    View.OnClickListener ReturnPage = new View.OnClickListener(){
        public void onClick(View v){
            Intent thuKichHoatMH1;
            thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(thuKichHoatMH1);
        }
    };
}
