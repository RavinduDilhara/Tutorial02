package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String numberOne = "com.example.myfirstapp.MESSAGE";
    public static final String numberTwo = "com.example.myfirstapp.MESSAGE.1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

}
    public void send(View view){

        Context context = getApplicationContext();
        CharSequence message = "Send Details Successfully.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);


        Intent intent = new Intent(this, SecondActivity.class);
        EditText num1 = (EditText) findViewById(R.id.editTextNum1);
        EditText num2 = (EditText) findViewById(R.id.editTextNum2);
        String number1 = num1.getText().toString();
        String number2 = num2.getText().toString();
        intent.putExtra(numberOne, number1);
        intent.putExtra(numberTwo, number2);
        startActivity(intent);
    }

}
