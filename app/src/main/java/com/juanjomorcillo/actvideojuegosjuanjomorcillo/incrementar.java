package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class incrementar extends AppCompatActivity {

    EditText etCantidad;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incrementar);
        this.setTitle("Incrementar");
        etCantidad = (EditText)findViewById(R.id.editTextCantidad);
        Bundle precios = getIntent().getExtras();
        contador = precios.getInt("claveCantidad");
        etCantidad.setText(""+contador);
    }

    public void cerrarSinGuardar(View view) {
        Intent devolverdatos = new Intent(this, precios.class);
        setResult(RESULT_CANCELED, devolverdatos);
        finish();
    }

    public void cerrarYGuardar(View view) {

        Intent devolverdatos = new Intent(this, precios.class);
        devolverdatos.putExtra("claveCantidad", contador);
        setResult(RESULT_OK, devolverdatos);
        finish();
    }

    public void sumarCantidad(View view) {

        contador=contador+1;
        etCantidad.setText(""+contador);
    }

    public void restarCantidad(View view) {

        if(contador<=0){
            contador=0;
        }else{
            contador=contador-1;
            etCantidad.setText(""+contador);
        }
    }
}