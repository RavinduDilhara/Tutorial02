package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.numberOne);
        String message1 = intent.getStringExtra(MainActivity.numberTwo);

        number1 = findViewById(R.id.editTextNum1);
        number2 = findViewById(R.id.editTextNum2);

        number1.setText(message);
        number2.setText(message1);


        Button add = findViewById(R.id.buttonAdd);
        Button min  = findViewById(R.id.buttonMin);
        Button mul = findViewById(R.id.buttonMul);
        Button div = findViewById(R.id.buttonDiv);

         result = findViewById(R.id.textViewResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int ans = num1 + num2;
                result.setGravity(Gravity.BOTTOM|Gravity.CENTER);

                result.setText(num1 +"+" + num2 + "=" + String.valueOf(ans));
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int ans = num1 - num2;

                result.setText(num1 +"-" + num2 + "=" + String.valueOf(ans));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int ans = num1 * num2;

                result.setText(num1 +"*" + num2 + "=" + String.valueOf(ans));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int ans = num1 / num2;

                result.setText(num1 +"/" + num2 + "=" + String.valueOf(ans));
            }
        });


    }

}
