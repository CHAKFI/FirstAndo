package com.example.firstando;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring variables

        Button ve = findViewById(R.id.verify);
        Button ca = findViewById(R.id.cancel);


        ve.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {


                EditText nm = findViewById(R.id.name);
                EditText bt = findViewById(R.id.birth);
                TextView dispName = findViewById(R.id.nameText);
                TextView res = findViewById(R.id.resultText);

                String n = nm.getText().toString();
                int b = Integer.parseInt(bt.getText().toString());
                int age = LocalDate.now().getYear() + 1900 - b;

                dispName.setText("Hi, "+nm);
                res.setText(age);
            }
        });


    }
}