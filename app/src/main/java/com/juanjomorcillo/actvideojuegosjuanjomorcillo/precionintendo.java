package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class precionintendo extends AppCompatActivity {

    String nuevoNombre;
    int nuevaCantidad;
    TextView tvPrecioNintendo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precionintendo);
        this.setTitle("Precio para Nintendo");
        tvPrecioNintendo = (TextView)findViewById(R.id.textViewPrecioNintendo);
        Bundle precios = getIntent().getExtras();
        nuevoNombre=precios.getString("claveNombre");
        nuevaCantidad=precios.getInt("claveCantidad");
        tvPrecioNintendo.setText("El precio para " +nuevaCantidad+ " dispositivos con el nombre "+ nuevoNombre +" es: "+(nuevaCantidad*(300+(nuevoNombre.length()*10))));
    }
    
    public void cerrarPrecioNintendo(View view) {

        finish();
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }
}