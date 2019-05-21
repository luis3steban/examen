package com.example.alumno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button distancia;
    Button temperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distancia =(Button)findViewById(R.id.btndistancia);
        temperatura =(Button)findViewById(R.id.btntemp);

        distancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent distance = new Intent(MainActivity.this, com.example.alumno.myapplication.distancia.class);
                startActivity(distance);
                Intent temperature = new Intent(MainActivity.this, com.example.alumno.myapplication.temperatura.class);
                startActivity(temperature);
            }
        });
    }


}
