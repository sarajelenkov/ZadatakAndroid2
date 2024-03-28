package com.example.zad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView iznosE=(TextView)findViewById(R.id.iznosE);
        iznosE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        TextView iznosD=(TextView)findViewById(R.id.iznosD);
        iznosD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        TextView kursE=(TextView)findViewById(R.id.kursE);
        kursE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        TextView kursD=(TextView)findViewById(R.id.kursD);
        kursD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button eud=(Button) findViewById(R.id.buttoneud);
        eud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        Button due=(Button) findViewById(R.id.buttondue);
        due.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        setContentView(R.layout.activity_main);
    }
}