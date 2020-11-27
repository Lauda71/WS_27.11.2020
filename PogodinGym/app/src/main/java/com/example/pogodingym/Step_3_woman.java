package com.example.pogodingym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;

public class Step_3_woman extends AppCompatActivity {

    // объявление нопок...
    Button musc_1;
    Button musc_2;
    Button musc_3;
    Button musc_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_3_woman);

        // нахождение элементов из xml файлов..
        musc_1 = (Button) findViewById(R.id.but_step3_woman_1);
        musc_2 = (Button) findViewById(R.id.but_step3_woman_2);
        musc_3 = (Button) findViewById(R.id.but_step3_woman_3);
        musc_4 = (Button) findViewById(R.id.but_step3_woman_4);

        // установка событий..
        musc_1.setOnClickListener(this::OnClick);
        musc_2.setOnClickListener(this::OnClick);
        musc_3.setOnClickListener(this::OnClick);
        musc_4.setOnClickListener(this::OnClick);
    }

    private void OnClick(View view) {

        // выбор нужной кнопм (мышцы) и переход на следующее окошко
        if(view.getId() == R.id.but_step3_woman_1){
            musc_1.setBackgroundColor(Color.GREEN);

            Intent intent = new Intent(this, Step_4.class);
            startActivity(intent);

        } else if (view.getId() == R.id.but_step3_woman_2){
            musc_2.setBackgroundColor(Color.GREEN);

            Intent intent = new Intent(this, Step_4.class);
            startActivity(intent);
        } else if (view.getId() == R.id.but_step3_woman_3){
            musc_3.setBackgroundColor(Color.GREEN);

            Intent intent = new Intent(this, Step_4.class);
            startActivity(intent);
        } else if (view.getId() == R.id.but_step3_woman_4){
            musc_4.setBackgroundColor(Color.GREEN);

            Intent intent = new Intent(this, Step_4.class);
            startActivity(intent);
        }
    }
}