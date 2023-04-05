package ru.sharipov.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonCancel, buttonEquals, buttonPlus, buttonMinus, buttonDivide, buttonMultiply, buttonDot;
    private String currentNumber = "";
    private String operation = "";
    private double firstNumber = 0.0;
    private double secondNumber = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonCancel = findViewById(R.id.buttonC);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDot = findViewById(R.id.buttonDot);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "0";
                tvResult.setText(currentNumber);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "1";
                tvResult.setText(currentNumber);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "2";
                tvResult.setText(currentNumber);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "3";
                tvResult.setText(currentNumber);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "4";
                tvResult.setText(currentNumber);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "5";
                tvResult.setText(currentNumber);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "6";
                tvResult.setText(currentNumber);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "7";
                tvResult.setText(currentNumber);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "8";
                tvResult.setText(currentNumber);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "9";
                tvResult.setText(currentNumber);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "+";
                firstNumber = Double.parseDouble(currentNumber);
                currentNumber = "";
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "-";
                firstNumber = Double.parseDouble(currentNumber);
                currentNumber = "";
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber = "";
                operation = "";
                firstNumber = 0.0;
                secondNumber = 0.0;
                tvResult.setText("");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "/";
                firstNumber = Double.parseDouble(currentNumber);
                currentNumber = "";
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "*";
                firstNumber = Double.parseDouble(currentNumber);
                currentNumber = "";
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += ".";
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumber = Double.parseDouble(currentNumber);
                double result = 0.0;

                if (operation.equals("+")) {
                    result = firstNumber + secondNumber;
                } else if (operation.equals("-")) {
                    result = firstNumber - secondNumber;
                } else if (operation.equals("/")) {
                    result = firstNumber / secondNumber;
                } else if (operation.equals("*")) {
                    result = firstNumber * secondNumber;
                }

                if (result == Math.floor(result)) {
                    int convertResult = (int) result;
                    currentNumber = Integer.toString(convertResult);
                    tvResult.setText(currentNumber);
                } else {
                    currentNumber = Double.toString(result);
                    tvResult.setText(currentNumber);
                }
            }
        });

    }
}