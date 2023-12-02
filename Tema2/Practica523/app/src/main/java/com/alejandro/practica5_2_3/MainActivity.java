package com.alejandro.practica5_2_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemSolar> itemsSolars = new ArrayList<>();
        itemsSolars.add(new ItemSolar("Corona Solar",R.drawable.corona_solar));
        itemsSolars.add(new ItemSolar("Eclipse Solar",R.drawable.erupcionsolar));
        itemsSolars.add(new ItemSolar("Erupcion Solar",R.drawable.espiculas));
        itemsSolars.add(new ItemSolar("Luna",R.drawable.filamentos));
        itemsSolars.add(new ItemSolar("Sol",R.drawable.magnetosfera));
        itemsSolars.add(new ItemSolar("Sol",R.drawable.manchasolar));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        ImageAdapter imageAdapter = new ImageAdapter(itemsSolars);

        recyclerView.setAdapter(imageAdapter);

        recyclerView.setAdapter(new ImageAdapter(itemsSolars));
    }
}