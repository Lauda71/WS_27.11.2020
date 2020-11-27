package com.example.pogodingym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeGym extends AppCompatActivity  {

    // нахождение элементов из xml файлов..
    Button sign_in;
    EditText tv_name;
    EditText tv_pass;

    // строковые переменные для пароли и имени, введенные пользователем
    String name;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_gym);

        tv_name = (EditText) findViewById(R.id.et_name);
        tv_pass = (EditText) findViewById(R.id.et_password);

        name = String.valueOf(tv_name.getText());
        pass = String.valueOf(tv_pass.getText());

        // инициалихация кнопки и установка события
        sign_in = (Button) findViewById(R.id.but_in);
        sign_in.setOnClickListener(this::OnClick);

        // установка локальных данных...
        SharedPreferences sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor sPrefed = sPref.edit();
        sPrefed.putString("login", name);
        sPrefed.putString("password", pass);
        sPrefed.commit();

    }

    private void OnClick(View view) {
        if(view.getId() == R.id.but_in){
            //что-то важное..
        }
    }

}