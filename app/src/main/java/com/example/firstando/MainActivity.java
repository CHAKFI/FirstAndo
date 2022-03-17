package com.example.firstando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring variables
        EditText nm = findViewById(R.id.name);
        EditText bt = findViewById(R.id.birth);
        Button ve = findViewById(R.id.verify);
        Button ca = findViewById(R.id.cancel);
        TextView dispName = findViewById(R.id.nameText);
        TextView age = findViewById(R.id.resultText);

        ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                

            }
        });


    }
}