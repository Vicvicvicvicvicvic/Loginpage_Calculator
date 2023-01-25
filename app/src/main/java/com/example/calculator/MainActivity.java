package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button calculate1, calculate2, calculate3, calculate4;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        calculate1 = findViewById(R.id.add);
        calculate2 = findViewById(R.id.subtract);
        calculate3 = findViewById(R.id.multiply);
        calculate4 = findViewById(R.id.divider);
        answer = findViewById(R.id.ans);

        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(number1.getText().toString());
                double no2 = Double.parseDouble(number2.getText().toString());
                double result = no1 + no2;
                if (result % 1 != 0) {
                    answer.setText("Result(add): " + result);
                }

                else{
                    answer.setText("Result(add): " + (int)result);
                }
            }
        });

        calculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(number1.getText().toString());
                double no2 = Double.parseDouble(number2.getText().toString());
                double result = no1 - no2;
                if (result % 1 != 0) {
                    answer.setText("Result(subtract): " + result);
                }

                else{
                    answer.setText("Result(subtract): " + (int)result);
                }
            }
        });

        calculate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(number1.getText().toString());
                double no2 = Double.parseDouble(number2.getText().toString());
                double result = no1 * no2;
                if (result % 1 != 0) {
                    answer.setText("Result(multiply): " + result);
                }

                else{
                    answer.setText("Result(multiply): " + (int)result);
                }
            }
        });

        calculate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double no1 = Double.parseDouble(number1.getText().toString());
                double no2 = Double.parseDouble(number2.getText().toString());
                double result = no1 / no2;
                if (result % 1 != 0) {
                    answer.setText("Result(divider): " + result);
                }

                else{
                    answer.setText("Result(divider): " + (int)result);
                }
            }
        });





    }
}