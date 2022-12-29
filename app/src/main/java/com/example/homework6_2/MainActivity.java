package com.example.homework6_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email,password;
    private TextView welcome,or,forgot,clickHere,enter;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         password = findViewById(R.id.pin);
         email = findViewById(R.id.email);
         button = findViewById(R.id.btn_one);
         welcome = findViewById(R.id.welcome);
         or = findViewById(R.id.text_or);
         forgot = findViewById(R.id.text_pin);
         clickHere = findViewById(R.id.click_here);
         enter = findViewById(R.id.enter);

         password.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {
                 if (password.getText().toString().isEmpty()) {
                     button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                 }else {
                     button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                 }

             }
         });

         email.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {
                 if (email.getText().toString().isEmpty()){
                     button.setBackgroundColor(Color.GRAY);
                 }else {
                     button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                 }

             }
         });
         button.setOnClickListener(view -> {
             if (email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")){
                 password.setVisibility(View.GONE);
                 email.setVisibility(View.GONE);
                 button.setVisibility(View.GONE);
                 or.setVisibility(View.GONE);
                 forgot.setVisibility(View.GONE);
                 clickHere.setVisibility(View.GONE);
                 enter.setVisibility(View.GONE);
                 Toast.makeText(this,"Вы успешно зарегистрировались!",Toast.LENGTH_SHORT).show();
             }else {
                 Toast.makeText(this,"Неверный пароль и логин",Toast.LENGTH_SHORT).show();
             }


         });

    }
}