package com.example.pogodingym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step_4 extends AppCompatActivity {

    // объявление кнопок
    Button btn_lvl_1;
    Button btn_lvl_2;
    Button btn_lvl_3;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_4);

        // инициализация кнопок
        btn_lvl_1 = (Button) findViewById(R.id.but_step4_1);
        btn_lvl_2 = (Button) findViewById(R.id.but_step4_2);
        btn_lvl_3 = (Button) findViewById(R.id.but_step4_3);
        btn_next = (Button) findViewById(R.id.but_step4_4);

        // установка событий для кнопок
        btn_lvl_1.setOnClickListener(this::OnClick);
        btn_lvl_2.setOnClickListener(this::OnClick);
        btn_lvl_3.setOnClickListener(this::OnClick);
        btn_next.setOnClickListener(this::OnClick);
    }

    private void OnClick(View view) {
        // выбор своего "типа"
        if(view.getId() == R.id.but_step4_1){
            btn_lvl_1.setBackgroundColor(Color.GREEN);

            btn_lvl_2.setBackgroundColor(Color.BLACK);
            btn_lvl_3.setBackgroundColor(Color.BLACK);
        } else if (view.getId() == R.id.but_step4_2){
            btn_lvl_2.setBackgroundColor(Color.GREEN);

            btn_lvl_1.setBackgroundColor(Color.BLACK);
            btn_lvl_3.setBackgroundColor(Color.BLACK);
        } else if (view.getId() == R.id.but_step4_3){
            btn_lvl_3.setBackgroundColor(Color.GREEN);

            btn_lvl_2.setBackgroundColor(Color.BLACK);
            btn_lvl_1.setBackgroundColor(Color.BLACK);
        } else if (view.getId() == R.id.but_step4_4){
            // переход на предфинальное окошко ('Step 5')
            Intent intent = new Intent(this, Step_5.class);
            startActivity(intent);
        }
    }
}