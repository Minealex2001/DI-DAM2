package com.example.di_dam2;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GenerosViewHolder extends RecyclerView.ViewHolder {

    public GenerosViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
        }
    };
}
