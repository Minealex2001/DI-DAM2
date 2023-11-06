package com.example.di_dam2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_player);

        String[] numerosDeTelefono = {"Numero 1", "Numero 2", "Numero 3", "Numero 4", "Numero 5", "Numero 6", "Numero 7", "Numero 8", "Numero 9", "Numero 10"};
        Spinner listaNumeros = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, numerosDeTelefono);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listaNumeros.setAdapter(adaptador);
    }
}