package com.example.helloworld;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Crear una variable de objeto de una subclase de View.
    private TextView tvMessage;
    private Button btAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Instanciar una variable.
        tvMessage = findViewById(R.id.textocaca);
        btAccept = findViewById(R.id.botoncaca);

        //3. Crear código
        //textocaca.setText("Hola!"); No pichita
        tvMessage.setText(R.string.tvMessage2);

        //botoncaca.setBackgroundResource(R.color.asul);
        btAccept.setBackgroundColor(ContextCompat.getColor(this, R.color.white));

    }
}