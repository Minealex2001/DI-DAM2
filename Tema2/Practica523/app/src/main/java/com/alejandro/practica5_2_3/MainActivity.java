package com.alejandro.practica5_2_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @SuppressLint("MissingInflatedId")
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_comparar, menu);
        getSupportActionBar().setTitle("El Sol");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.compararPlanetas){
            Intent i = new Intent(this, CompararPlanetas.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}