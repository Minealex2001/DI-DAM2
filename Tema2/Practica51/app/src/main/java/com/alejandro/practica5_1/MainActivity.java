package com.alejandro.practica5_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> imagenes = new ArrayList<>();
        imagenes.add(R.drawable.image1);
        imagenes.add(R.drawable.image2);
        imagenes.add(R.drawable.image3);
        imagenes.add(R.drawable.image4);
        imagenes.add(R.drawable.image5);
        imagenes.add(R.drawable.image6);
        imagenes.add(R.drawable.image7);
        imagenes.add(R.drawable.image8);
        imagenes.add(R.drawable.image9);

        RecyclerView recyclerView = findViewById(R.id.reciclerViewImagen);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ImageAdapter adapter = new ImageAdapter(imagenes);

        recyclerView.setAdapter(adapter);

        ImageSwitcher IS = findViewById(R.id.imageSwitcher);

        IS.setFactory(() -> {
            ImageView imageView = new ImageView(getApplicationContext());
            return imageView;
        });
    }
}