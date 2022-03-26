package com.example.firstando;

import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;

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
//                int age = LocalDate.now().getYear() - b;
//                res.setText(age);

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