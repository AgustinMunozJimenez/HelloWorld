package com.example.helloworld;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Crear una variable de objeto de una subclase de View.
    private TextView tvMessage;
    private Button btAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Instanciar una variable.
        tvMessage = findViewById(R.id.tvMessage);
        btAceptar = findViewById(R.id.btAceptar);

        //3. Crear código
        //tvMessage.setText("Hola!"); No pichita
        tvMessage.setText(R.string.tvMessage2);

        //btAceptar.setBackgroundResource(R.color.asul);
        btAceptar.setBackgroundColor(ContextCompat.getColor(this, R.color.white));

    }
}