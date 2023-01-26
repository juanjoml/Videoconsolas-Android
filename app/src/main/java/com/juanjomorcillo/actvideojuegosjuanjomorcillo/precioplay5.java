package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class precioplay5 extends AppCompatActivity {

    String nuevoNombre;
    int nuevaCantidad;
    TextView tvPrecioPlay5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precioplay5);
        this.setTitle("Precio para Play 5");
        tvPrecioPlay5 = (TextView)findViewById(R.id.textViewPrecioPlay5);
        Bundle precios = getIntent().getExtras();
        nuevoNombre=precios.getString("claveNombre");
        nuevaCantidad=precios.getInt("claveCantidad");
        tvPrecioPlay5.setText("El precio para " +nuevaCantidad+ " dispositivos con el nombre "+ nuevoNombre +" es: "+(nuevaCantidad*(400+(nuevoNombre.length()*10))));
    }

    public void cerrarPrecioPlay5(View view) {

        finish();
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }
}