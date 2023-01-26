package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class precios extends AppCompatActivity {

    EditText etNombre;
    EditText etUnidades;

    int cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precios);
        this.setTitle("Precios personalizados");
        etNombre = (EditText)findViewById(R.id.editTextNombre);
        etUnidades = (EditText)findViewById(R.id.editTextIUnidades);
    }

    public void abrirPrecioPlay5(View view) {

        String nombre = etNombre.getText().toString();
        cantidad = Integer.parseInt(etUnidades.getText().toString());
        Intent cargarPrecioPlay5 = new Intent (this, precioplay5.class);
        cargarPrecioPlay5.putExtra("claveNombre",nombre);
        cargarPrecioPlay5.putExtra("claveCantidad",cantidad);
        startActivity(cargarPrecioPlay5);
    }

    public void abrirIncrementar(View view) {

        cantidad = Integer.parseInt(etUnidades.getText().toString());
        Intent cargarIncrementar = new Intent (this, incrementar.class);
        cargarIncrementar.putExtra("claveCantidad",cantidad);
        startActivityForResult(cargarIncrementar,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){
            if(requestCode==1){
                int numerodevuelto=data.getExtras().getInt("claveCantidad",1);
                etUnidades.setText(""+numerodevuelto);
                Toast.makeText(this, "Valor devuelto: "+numerodevuelto, Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Ningun dato a mostrar", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }

    public void funcionVolver(View view) {

        finish();
    }

    public void funcionAbrirNintendo(View view) {

        String nombre = etNombre.getText().toString();
        cantidad = Integer.parseInt(etUnidades.getText().toString());
        Intent cargarNintendo = new Intent(this, precionintendo.class);
        cargarNintendo.putExtra("claveNombre",nombre);
        cargarNintendo.putExtra("claveCantidad",cantidad);
        startActivity(cargarNintendo);
    }
}