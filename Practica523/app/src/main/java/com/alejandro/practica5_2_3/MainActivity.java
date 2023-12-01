package com.alejandro.practica5_2_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> imagenes = new ArrayList<>();
        imagenes.add(R.drawable.corona_solar);
        imagenes.add(R.drawable.erupcionsolar);
        imagenes.add(R.drawable.espiculas);
        imagenes.add(R.drawable.filamentos);
        imagenes.add(R.drawable.magnetosfera);
        imagenes.add(R.drawable.manchasolar);

        RecyclerView recyclerView = findViewById(R.id.reciclerViewImagen);
    }
}