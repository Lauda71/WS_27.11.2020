package com.example.pogodingym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step_1 extends AppCompatActivity {

    Button but_1;
    Button but_2;
    Button but_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_1);

        but_1 = (Button) findViewById(R.id.but_step1_1);
        but_2 = (Button) findViewById(R.id.but_step1_2);
        but_3 = (Button) findViewById(R.id.but_step1_3);


        but_1.setOnClickListener(this::OnClick);
        but_2.setOnClickListener(this::OnClick);
        but_3.setOnClickListener(this::OnClick);
    }

    private void OnClick(View view) {

        // выбор нужного значения и переход на следующее окошко
        if(view.getId() == R.id.but_step1_1){
            but_1.setBackgroundColor(Color.GREEN);

            Intent intent = new Intent(this, Step_2.class);
            startActivity(intent);

        } else if (view.getId() == R.id.but_step1_2){

        } else if(view.getId() == R.id.but_step1_3){

        }
    }
}