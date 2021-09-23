package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public double[] getIntegerFromCalculator(View view){
        EditText firstNumber = (EditText) findViewById(R.id.EnterFirstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.EnterSecondNumber);
        double[] a = new double[2];
        a[0] = Double.parseDouble(firstNumber.getText().toString());
        a[1] = Double.parseDouble(secondNumber.getText().toString());
        return a;
    }
    public void plusFunction(View view){
        double[] a = getIntegerFromCalculator(view);
        double solution = a[0] + a[1];
        goToActivity2(""+solution);
    }
    public void subFunction(View view){
        double[] a = getIntegerFromCalculator(view);
        double solution = a[0] - a[1];
        goToActivity2(""+solution);
    }
    public void mulFunction(View view){
        double[] a = getIntegerFromCalculator(view);
        double solution = a[0] * a[1];
        goToActivity2(""+solution);
    }
    public void divFunction(View view){
        double[] a = getIntegerFromCalculator(view);
        double solution = a[0] / a[1];
        goToActivity2(""+solution);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}