package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvActivityMain;
    Button btFrabricantes;
    Button btCompras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("estado", "onCreate - Abro el activity MainActivity, cargando los datos");
        tvActivityMain = (TextView)findViewById(R.id.textViewEstadoActivityMain);
        btFrabricantes = (Button)findViewById(R.id.buttonFabricantes);
        btCompras = (Button)findViewById(R.id.buttonCompras);
    }

    public void abrirFabricantes(View view) {

        Intent cargarFabricantes = new Intent (this, Fabricantes.class);
        startActivity(cargarFabricantes);
    }

    public void onBackPressed() {
        //super.onBackPressed();  Esta línea es la que controla el botón atrás (cierra el activity en pila y carga el anterior)
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }

    protected void  onStart()
    {
        super.onStart();
        Log.i("estado", "onStart - el activity MainActivity ya se está ejecutando, Todavía no visible");
        tvActivityMain.setText("Segundo plano");
        tvActivityMain.setBackgroundColor(Color.GRAY);
        btFrabricantes.setVisibility(View.INVISIBLE);
        btCompras.setVisibility(View.INVISIBLE);
    }

    protected void  onResume()
    {
        super.onResume();
        Log.i("estado", "onResume - el activity MainActivity ya es visible");
        tvActivityMain.setText("Primer plano");
        tvActivityMain.setBackgroundColor(Color.WHITE);
        btFrabricantes.setVisibility(View.VISIBLE);
        btCompras.setVisibility(View.VISIBLE);
    }

    protected void  onPause()
    {
        super.onPause();
        Log.i("estado", "onResume - el activity MainActivity aún está visible, pero ya va a salir de la aplicación");
        tvActivityMain.setText("Primer plano");
        tvActivityMain.setBackgroundColor(Color.WHITE);
        btFrabricantes.setVisibility(View.VISIBLE);
        btCompras.setVisibility(View.VISIBLE);
    }

    protected void  onStop()
    {
        super.onStop();
        Log.i("estado", "onStop - el activity MainActivity se está cerrando, pero está en segundo plano, no visible");
        tvActivityMain.setText("Segundo plano");
        tvActivityMain.setBackgroundColor(Color.GRAY);
        btFrabricantes.setVisibility(View.INVISIBLE);
        btCompras.setVisibility(View.INVISIBLE);
    }

    protected void  onDestroy()
    {
        super.onDestroy();
        Log.i("estado", "onDestroy - el activity MainActivity se cierra completamente, ya está no visible");
    }

    protected void  onRestart()
    {
        super.onRestart();
        Log.i("estado", "onRestart - el activity MainActivity se mantiene en multitarea en segundo plano y se vuelve a abrir");
    }

    public void abrirPrecios(View view) {

        Intent cargarPrecios = new Intent (this, precios.class);
        startActivity(cargarPrecios);
    }
}