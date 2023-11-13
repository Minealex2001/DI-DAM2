package com.example.di_dam2;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.di_dam2.about.AboutAdapter;

import java.util.List;

public class About extends AppCompatActivity {

    private final List<Integer> images = List.of(
            R.mipmap.games_aircontrol_foreground,
            R.mipmap.games_angrybirds_foreground,
            R.mipmap.games_dragonfly_foreground,
            R.mipmap.games_hillclimbingracing_foreground,
            R.mipmap.games_ninijump_foreground,
            R.mipmap.games_pocketsoccer_foreground,
            R.mipmap.games_radiantdefense_foreground
    );

    private final List<String> names = List.of("Javier", "Jorge", "Jordi", "Jose", "Juan", "Julia", "Julian");
    private final List<String> years = List.of("1990", "1991", "1992", "1993", "1994", "1995", "1996");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        AboutAdapter adapter = new AboutAdapter(images, names, years, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}