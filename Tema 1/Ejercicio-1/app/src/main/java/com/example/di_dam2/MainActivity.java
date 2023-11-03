package com.example.di_dam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newPlayerButton = findViewById(R.id.nuevoplayer);
        Button preferencesButton = findViewById(R.id.ajustes);
        Button gameButton = findViewById(R.id.jugar);
        Button aboutButton = findViewById(R.id.sobre);

        newPlayerButton.setOnClickListener(v -> {
            Intent i = new Intent(this, NewPlayer.class);
            startActivity(i);
        });

        preferencesButton.setOnClickListener(v -> {
            Intent i = new Intent(this, Preferences.class);
            startActivity(i);
        });

        gameButton.setOnClickListener(v -> {
            Intent i = new Intent(this, Games.class);
            startActivity(i);
        });

        aboutButton.setOnClickListener(v -> {
            Intent i = new Intent(this, About.class);
            startActivity(i);
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_buscar) {
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}