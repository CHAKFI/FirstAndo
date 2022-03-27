package com.example.firstando;


import android.os.Build;import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring variables

        EditText nm = findViewById(R.id.name);
        EditText bt = findViewById(R.id.birth);
        TextView dispName = findViewById(R.id.nameText);
        TextView res = findViewById(R.id.resultText);
        Button ve = findViewById(R.id.verify);
        Button ca = findViewById(R.id.cancel);

        ve.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {

                String n = nm.getText().toString();
                dispName.setText("Hi, "+ n);

                int b = Integer.parseInt(bt.getText().toString());
                Date d = new Date();

                if(String.valueOf(b) == "") {
                    res.setText("Please Rerty");
                }else {
                    int y = (d.getYear() + 1900) - b;
                    if( y < 18 && y > 0 ) {
                        res.setText("Sorry, you are minor");
                    }else if (y > 18){
                        res.setText(String.valueOf(y));
                    }
                }

//                int age = ((Calendar.YEAR) + 2022) - b;
//                res.setText(String.valueOf(age));

            }
        });

        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}