package com.alejandro.practica5_1;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageViewHolder extends RecyclerView.ViewHolder{

    protected ImageView imagenview;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);

        imagenview = itemView.findViewById(R.id.imageView);
    }
}