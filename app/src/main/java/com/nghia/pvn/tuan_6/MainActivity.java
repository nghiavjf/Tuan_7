package com.nghia.pvn.tuan_6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open(v);
            }
        });
        Button button2=findViewById(R.id.btn3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2(v);
            }
        });
    }

    void open(View view){
        Intent myIntent=new Intent( this, activity_2.class);

        startActivity(myIntent);

    }
    void open2(View view){

        Intent myIntent2=new Intent( this, signup.class);

        startActivity(myIntent2);
    }

}