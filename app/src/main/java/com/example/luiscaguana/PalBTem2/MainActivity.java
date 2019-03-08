package com.example.luiscaguana.PalBTem2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvNuevaCuenta;
    private Button Conectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNuevaCuenta = findViewById(R.id.tvNuevaCuenta);

        tvNuevaCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hola",Toast.LENGTH_LONG);
            }
        });
    }

    public void c_btnSignIn(View v){


    }




}