package com.example.di_dam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class preferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar2);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        ratingBar.setOnRatingBarChangeListener((ratingBar1, rating, fromUser) -> {
            // TODO Auto-generated method stub
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                // TODO Auto-generated method stub
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        fab.setOnClickListener(view -> Toast.makeText(preferences.this, "FAB Clicked", Toast.LENGTH_SHORT).show());


    }

}