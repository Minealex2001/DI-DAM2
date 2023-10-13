package com.example.di_dam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newPlayerButton = findViewById(R.id.nuevoplayer);

        newPlayerButton.setOnClickListener(v -> {
            setContentView(R.layout.activity_new_player);
        });
    }
}