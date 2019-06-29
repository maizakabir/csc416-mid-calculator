package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonC, buttonE, buttonA, buttonS, buttonM, buttonD, buttonP, buttonDivX;
    TextView textView;
    Float textVal1, textVal2, result;
    Boolean add, sub, multi, div, percent, divX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0= findViewById(R.id.btn0);
        button1= findViewById(R.id.btn1);
        button2= findViewById(R.id.btn2);
        button3= findViewById(R.id.btn3);
        button4= findViewById(R.id.btn4);
        button5= findViewById(R.id.btn5);
        button6= findViewById(R.id.btn6);
        button7= findViewById(R.id.btn7);
        button8= findViewById(R.id.btn8);
        button9= findViewById(R.id.btn9);
        buttonC= findViewById(R.id.btnClear);
        buttonE= findViewById(R.id.btnEqual);
        buttonA= findViewById(R.id.btnPlus);
        buttonS= findViewById(R.id.btnMinus);
        buttonM= findViewById(R.id.btnMulti);
        buttonD= findViewById(R.id.btnDiv);
        buttonP= findViewById(R.id.btnPercent);
        buttonDivX= findViewById(R.id.btnDivByX);
        textView= findViewById(R.id.textView);
    }

    public void onClickNumber(View view) {

        switch (view.getId()){
            case R.id.btn0:
                //int num0 = Integer.parseInt(button0.getText().toString());
                textView.setText (textView.getText()+ "0");
                break;

            case R.id.btn1:
                //int num1 = Integer.parseInt(button1.getText().toString());
                textView.setText (textView.getText() + "1");
                break;

            case R.id.btn2:
                //int num2 = Integer.parseInt(button2.getText().toString());
                textView.setText (textView.getText() + "2");
                break;

            case R.id.btn3:
                //int num3 = Integer.parseInt(button3.getText().toString());
                textView.setText (textView.getText() + "3");
                break;

            case R.id.btn4:
                //int num4 = Integer.parseInt(button4.getText().toString());
                textView.setText (textView.getText() + "4");
                break;

            case R.id.btn5:
                //int num5 = Integer.parseInt(button5.getText().toString());
                textView.setText (textView.getText()+ "5");
                break;

            case R.id.btn6:
                //int num6 = Integer.parseInt(button6.getText().toString());
                textView.setText (textView.getText() + "6");
                break;

            case R.id.btn7:
                //int num7 = Integer.parseInt(button7.getText().toString());
                textView.setText (textView.getText() + "7");
                break;

            case R.id.btn8:
                //int num8 = Integer.parseInt(button8.getText().toString());
                textView.setText (textView.getText() + "8");
                break;

            case R.id.btn9:
                //int num9 = Integer.parseInt(button9.getText().toString());
                textView.setText (textView.getText() + "9");
                break;
        }
    }

    public void onClickClear(View view) {
        switch(view.getId()){
            case R.id.btnClear:
                textView.setText("0");
        }
    }

    public void onClickEqual(View view) {
        textVal2 = Float.parseFloat (textView.getText().toString() );

        if (add == true){
                result = textVal1 + textVal2;
                textView.setText(result + "");
                add = false;
        }

         else if (sub == true){
            result = textVal1 - textVal2;
            textView.setText(result + "");
            sub = false;
        }

        else if (multi == true){
            result = textVal1 * textVal2;
            textView.setText(result + "");
            multi = false;
        }

        else if (div == true){
            result = textVal1 / textVal2;
            textView.setText(result + "");
            div = false;
        }

        else if (percent == true){
            result = textVal1 / 100;
            textView.setText(result + "");
            percent = false;
        }

        else if (divX == true){
            result = 1 / textVal1;
            textView.setText(result + "");
            divX = false;
        }
    }

    public void onClickOperator(View view) {
        switch (view.getId()){
            case R.id.btnPlus:
                textVal1 = Float.parseFloat(textView.getText().toString());
                add = true;
                textView.setText(null);
                break;

            case R.id.btnMinus:
                textVal1 = Float.parseFloat(textView.getText().toString());
                sub = true;
                textView.setText(null);
                break;

            case R.id.btnMulti:
                textVal1 = Float.parseFloat(textView.getText().toString());
                multi = true;
                textView.setText(null);
                break;

            case R.id.btnDiv:
                textVal1 = Float.parseFloat(textView.getText().toString());
                div = true;
                textView.setText(null);
                break;

            case R.id.btnPercent:
                textVal1 = Float.parseFloat(textView.getText().toString());
                percent = true;
                break;

            case R.id.btnDivByX:
                textVal1 = Float.parseFloat(textView.getText().toString());
                divX = true;
                break;
        }
    }
}
