package com.example.calculatorappjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private boolean operationDone = false;
    private TextView textView = null;
    private TextView textError = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textError = (TextView) findViewById(R.id.textView);
        textError.setVisibility(View.GONE);
        textView = (TextView) findViewById(R.id.textView2);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(buton1());
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(buton2());
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(buton3());
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button button0 = (Button) findViewById(R.id.button19);
        button0.setOnClickListener(this);

        Button buttonPoint = (Button) findViewById(R.id.button31);
        buttonPoint.setOnClickListener(this);
        Button buttonAC = (Button) findViewById(R.id.button28);
        buttonAC.setOnClickListener(this);
        Button buttonDEL = (Button) findViewById(R.id.button29);
        buttonDEL.setOnClickListener(this);
        Button buttonSuma = (Button) findViewById(R.id.button26);
        buttonSuma.setOnClickListener(this);
        Button buttonResta = (Button) findViewById(R.id.button27);
        buttonResta.setOnClickListener(this);
        Button buttonMulti = (Button) findViewById(R.id.button25);
        buttonMulti.setOnClickListener(this);
        Button buttonDivi = (Button) findViewById(R.id.button23);
        buttonDivi.setOnClickListener(this);
        Button buttonResult = (Button) findViewById(R.id.button20);
        buttonResult.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        try{
            if (operationDone) {
                textView.setText( "" );
                operationDone = false;
            }

        } catch (Exception e){
            textError.setVisibility(View.VISIBLE);
            textView.setText("");
        }
    }

    public View.OnClickListener buton1 (){
        textView.setText(textView.getText().toString() + "1");
        return null;
    }
    public View.OnClickListener buton2 (){
        textView.setText(textView.getText().toString() + "2");
        return null;
    }
    public View.OnClickListener buton3 (){
        textView.setText(textView.getText().toString() + "3");
        return null;
    }
}