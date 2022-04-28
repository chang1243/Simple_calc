package com.example.simple_calc;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        EditText e1 = findViewById(R.id.edNUM1);
        EditText e2 = findViewById(R.id.edNUM2);
        ImageButton add = findViewById(R.id.add);
        ImageButton sub = findViewById(R.id.sub);
        ImageButton mul = findViewById(R.id.mul);
        ImageButton div = findViewById(R.id.div);
        TextView t1 = findViewById(R.id.answer);




       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String s1= e1.getText().toString();
               String s2= e2.getText().toString();
              int num1 = Integer.parseInt(s1);
               int num2= Integer.parseInt(s2);
               t1.setText(Integer.toString(num1-num2));

           }
       });
       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String s1= e1.getText().toString();
               String s2= e2.getText().toString();
               int num1 = Integer.parseInt(s1);
               int num2= Integer.parseInt(s2);
               t1.setText(Integer.toString(num1+num2));

           }
       });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                int num1 = Integer.parseInt(s1);
                int num2= Integer.parseInt(s2);
                t1.setText(Integer.toString(num1*num2));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                int num1 = Integer.parseInt(s1);
                int num2= Integer.parseInt(s2);
                t1.setText(Float.toString(num1/num2));

            }
        });

    }




    }






