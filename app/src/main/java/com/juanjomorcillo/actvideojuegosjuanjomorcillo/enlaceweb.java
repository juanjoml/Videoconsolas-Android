package com.juanjomorcillo.actvideojuegosjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class enlaceweb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlaceweb);
        this.setTitle("Enlace web");
    }

    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "No puedes pulsar este botón", Toast.LENGTH_SHORT).show();
    }

    public void funcionVolver(View view) {

        finish();
    }
}