package com.example.di_dam2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.di_dam2.about.AboutAdapter;

import java.util.ArrayList;
import java.util.List;

public class About extends AppCompatActivity {

    private final List<Integer> images = new ArrayList<>() {
        {
            add(R.mipmap.image1_launcher_foreground);
            add(R.mipmap.image2_launcher_foreground);
            add(R.mipmap.image3_launcher_foreground);
            add(R.mipmap.image4_launcher_foreground);
            add(R.mipmap.image5_launcher_foreground);
            add(R.mipmap.image6_launcher_foreground);
            add(R.mipmap.image7_launcher_foreground);
            add(R.mipmap.image8_launcher_foreground);
        }
    };

    private final List<String> names = new ArrayList<>() {{
        add("María Mata");
        add("Antonio Sanz");
        add("Carlos");
        add("Berta");
        add("Héctor Campos");
        add("Ismael");
        add("Juan Carlos");
        add("Isabel");
    }};

    private final List<String> years = new ArrayList<>() {{
        add("2014");
        add("1890");
        add("967");
        add("945");
        add("879");
        add("678");
        add("669");
        add("420");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        RecyclerView recyclerView = findViewById(R.id.aboutRecyclerView);

        AboutAdapter adapter = new AboutAdapter(images, names, years, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}