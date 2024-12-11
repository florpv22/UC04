package com.example.dam_uc4_pizango;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // Definir el evento click sobre el botón Login
        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NotasActivity.class);
                startActivity(i);
            }

        });
    }
}