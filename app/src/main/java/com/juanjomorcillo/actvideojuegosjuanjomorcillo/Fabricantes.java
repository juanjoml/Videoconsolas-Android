package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Fabricantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabricantes);
        this.setTitle("Fabricantes");
        Log.i("estado", "onCreate - Abro el activity Fabricantes, cargando los datos");
    }

    public void abrirSony(View view) {

        Intent cargarSony = new Intent (this, Sony.class);
        startActivity(cargarSony);
    }

    public void abrirMicrosoft(View view) {

        Intent cargarMicrosoft = new Intent (this, Microsoft.class);
        startActivity(cargarMicrosoft);
    }

    public void abrirNintendo(View view) {

        Intent cargarNintendo = new Intent (this, Nintendo.class);
        startActivity(cargarNintendo);
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }

    protected void  onStart()
    {
        super.onStart();
        Log.i("estado", "onStart - el activity Fabricantes ya se está ejecutando, Todavía no visible");
    }

    protected void  onResume()
    {
        super.onResume();
        Log.i("estado", "onResume - el activity Fabricantes ya es visible");
    }

    protected void  onPause()
    {
        super.onPause();
        Log.i("estado", "onResume - el activity Fabricantes aún está visible, pero ya va a salir de la aplicación");
    }

    protected void  onStop()
    {
        super.onStop();
        Log.i("estado", "onStop - el activity Fabricantes se está cerrando, pero está en segundo plano, no visible");
    }

    protected void  onDestroy()
    {
        super.onDestroy();
        Log.i("estado", "onDestroy - el activity Fabricantes se cierra completamente, ya está no visible");
    }

    protected void  onRestart()
    {
        super.onRestart();
        Log.i("estado", "onRestart - el activity Fabricantes se mantiene en multitarea en segundo plano y se vuelve a abrir  Se va a cerrar, ya está no visible");
    }

    public void funcionVolver(View view) {

        finish();
    }
}