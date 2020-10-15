package com.nghia.pvn.tuan_6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class activity_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button button1=findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open(v);
            }
        });
        Button button2=findViewById(R.id.btn_nhac);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2(v);
            }
        });
    }

    void open(View view){
        Intent myIntent=new Intent( this, MainActivity.class);
        startActivity(myIntent);
    }
    void open2(View view){
        Intent myIntent=new Intent( this, list_main.class);
        startActivity(myIntent);
    }
}