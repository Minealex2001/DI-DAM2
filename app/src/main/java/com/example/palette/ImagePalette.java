package com.example.palette;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.transition.ChangeImageTransform;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.palette.graphics.Palette;

public class ImagePalette extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setSharedElementEnterTransition(new ChangeImageTransform());
        setContentView(R.layout.activity_image_palette);

        // Obtén la imagen seleccionada del Intent
        int selectedImage = getIntent().getIntExtra("image_resource", 0);

        // Configura la imagen en el ImageView
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(selectedImage);
        imageView.setTransitionName("shared_image");

        // Genera la paleta de colores
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), selectedImage);
        Palette.from(bitmap).generate(palette -> {
   // Aquí tienes tu instancia de Palette
   if (palette != null) {
       // Obtén los colores que necesitas
       int defaultColor = 0xFFFFFF; // Color blanco por defecto
       int vibrantColor = palette.getVibrantColor(defaultColor);
       int darkVibrantColor = palette.getDarkVibrantColor(defaultColor);
       int lightVibrantColor = palette.getLightVibrantColor(defaultColor);
       int mutedColor = palette.getMutedColor(defaultColor);
       int darkMutedColor = palette.getDarkMutedColor(defaultColor);
       int lightMutedColor = palette.getLightMutedColor(defaultColor);

       // Ahora puedes usar estos colores para cambiar los colores de tu actividad
       // Por ejemplo, puedes cambiar el color de la ToolBar, StatusBar y TextViews
       Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
       toolbar.setBackgroundColor(vibrantColor);
       getSupportActionBar().setTitle("Palette");

       Window window = getWindow();
       window.setStatusBarColor(darkVibrantColor);

       TextView textView1 = findViewById(R.id.textView1);
       textView1.setBackgroundColor(lightVibrantColor);

       TextView textView2 = findViewById(R.id.textView2);
       textView2.setBackgroundColor(mutedColor);

       TextView textView3 = findViewById(R.id.textView3);
       textView3.setBackgroundColor(darkMutedColor);

       TextView textView4 = findViewById(R.id.textView4);
       textView4.setBackgroundColor(lightMutedColor);
   }
});
    }
}