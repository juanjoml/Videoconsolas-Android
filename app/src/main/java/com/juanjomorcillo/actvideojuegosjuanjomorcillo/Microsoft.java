package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Microsoft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);
        this.setTitle("Microsoft");
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }

    public void cerrarMicrosoft(View view) {

        finish();
    }

    public void funcionabrirenlaces(View view) {

        Intent cargarEnlaces = new Intent(this, enlaceweb.class);
        startActivity(cargarEnlaces);
    }
}