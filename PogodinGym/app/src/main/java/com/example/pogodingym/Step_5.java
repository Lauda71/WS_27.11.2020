package com.example.pogodingym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Step_5 extends AppCompatActivity {

    // объявление кнопки и текстового поля
    Button but_next;

    EditText et_height;
    EditText et_width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_5);

        // инициализация кнопок и текстовых полей
        but_next = (Button) findViewById(R.id.but_step5_next);
        but_next.setOnClickListener(this::OnClick);

        et_height = (EditText) findViewById(R.id.et_height);
        et_width = (EditText) findViewById(R.id.et_width);
    }

    private void OnClick(View view) {
        if(view.getId() == R.id.but_step5_next){

            // переменные для получения введенного пользователем значений веса и роста
            Double h = Double.parseDouble(String.valueOf(et_height.getText()));
            Double w = Double.parseDouble(String.valueOf(et_height.getText()));

            // проверки на воод
            if(h != null && h != 0){
                if(w != null && w != 0){
                    but_next.setBackgroundColor(Color.GREEN);

                    // переход на окно входа
                    Intent intent = new Intent(this, HomeGym.class);
                    startActivity(intent);
                }
            }
        }
    }
}