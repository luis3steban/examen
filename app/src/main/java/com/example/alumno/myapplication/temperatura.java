package com.example.alumno.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temperatura extends AppCompatActivity {
    TextView res;
    EditText cm;
    Button toInch, toFt, toYards;
    String centimetros,resultado;
    double inch, foot, yards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();
    }

    private void setViews(){
        res = (TextView) findViewById(R.id.tvRes);
        cm = ( EditText) findViewById(R.id.edtCm);
        toInch = (Button)findViewById(R.id.btncl);
        toFt = (Button)findViewById(R.id.btnFr);
        toYards = (Button)findViewById(R.id.btnK);
    }

    private void getCm(){
        centimetros = cm.getText().toString();
        cm.setText("");
    }

    private void hideKeyboard(View view){
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(),0);
    }

    public void toInch(View view){
        getCm();

        //Calculo a METROS
        inch = Double.parseDouble(centimetros)*1.8+32;
        resultado = String.valueOf(inch);
        res.setText(resultado);
        hideKeyboard(view);
    }

    public void toFt(View view){
        getCm();

        //Calculo a Pies
        foot = Double.parseDouble(centimetros)- 32/1.8;
        resultado = String.valueOf(foot);
        res.setText(resultado);
        hideKeyboard(view);
    }

    public void toYards(View view){
        getCm();

        //Calculo a yardas
        yards = Double.parseDouble(centimetros)  +273.15;
        resultado = String.valueOf(yards);
        res.setText(resultado);
        hideKeyboard(view);
    }
}
