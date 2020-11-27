package com.example.pogodingym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Step_2 extends AppCompatActivity {

    // объявление нопок
    Button but_male;
    Button but_fem;
    Button next;

    // проверка на выбор пола
    boolean man;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_2);

        // нахождение элементов из xml файлов..
        but_male = (Button) findViewById(R.id.but_step2_1);
        but_fem = (Button) findViewById(R.id.but_step2_2);
        next = (Button) findViewById(R.id.but_step2_next);

        // установка события
        but_male.setOnClickListener(this::OnClick);
        but_fem.setOnClickListener(this::OnClick);
        next.setOnClickListener(this::OnClick);
    }

    private void OnClick(View view) {
        Log.e("Событие клика", "Начало");

        // проверка нажатой кнопки и установка значения переменной 'man' и переход на следующее окошко, если все корректно
        if(view.getId() == R.id.but_step2_1){
            but_male.setBackgroundColor(Color.GREEN);
            but_fem.setBackgroundColor(Color.RED);

            man = true;
            Log.e("МУЖ", "сменил цвет, man = " + man);
        } else if (view.getId() == R.id.but_step2_2){
            but_male.setBackgroundColor(Color.RED);
            but_fem.setBackgroundColor(Color.GREEN);

            man = false;
            man = true;
            Log.e("ЖЕН", "сменил цвет, man = " + man);
        } else if(view.getId() == R.id.but_step2_next){
            if(man == true){
                Intent intent = new Intent(this, Step_3_man.class);
                startActivity(intent);
            } else if(man == false){
                Intent intent = new Intent(this, Step_3_woman.class);
                startActivity(intent);
            } else{
                Log.e("3-й else", "Ничего...");
            }

            Log.e("Событие клика", "Конец");
        }
    }
}