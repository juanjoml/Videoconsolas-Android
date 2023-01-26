package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Sony extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sony);
        this.setTitle("Sony");
        Log.i("estado", "onCreate - Abro el activity Sony, cargando los datos");
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }

    public void cerrarSony(View view) {

        finish();
    }

    protected void  onStart()
    {
        super.onStart();
        Log.i("estado", "onStart - el activity Sony ya se está ejecutando, Todavía no visible");
    }

    protected void  onResume()
    {
        super.onResume();
        Log.i("estado", "onResume - el activity Sony ya es visible");
    }

    protected void  onPause()
    {
        super.onPause();
        Log.i("estado", "onResume - el activity Sony aún está visible, pero ya va a salir de la aplicación");
    }

    protected void  onStop()
    {
        super.onStop();
        Log.i("estado", "onStop - el activity Sony se está cerrando, pero está en segundo plano, no visible");
    }

    protected void  onDestroy()
    {
        super.onDestroy();
        Log.i("estado", "onDestroy - el activity Sony se cierra completamente, ya está no visible");
    }

    protected void  onRestart()
    {
        super.onRestart();
        Log.i("estado", "onRestart - el activity Sony se mantiene en multitarea en segundo plano y se vuelve a abrir");
    }

    public void funcionabrirenlaces(View view) {

        Intent cargarEnlaces = new Intent(this, enlaceweb.class);
        startActivity(cargarEnlaces);
    }
}