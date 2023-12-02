package com.alejandro.practica5_2_3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private List<ItemSolar> datos;
    public ImageAdapter(List<ItemSolar> imagenes) {
        this.datos = imagenes;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        protected ImageView imageView;
        public ImageViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ItemSolar item = datos.get(position);
        holder.imageView.setImageResource(item.getImagen());
        Toolbar toolbar = (Toolbar) holder.itemView.findViewById(R.id.toolbar);
        toolbar.setTitle(item.getNombre());

        toolbar.inflateMenu(R.menu.menu_solar);
        toolbar.setOnMenuItemClickListener(item1 -> {
            // Handle the menu item

            if (item1.getItemId() == R.id.copiarMenu) {
                ItemSolar originalItem = datos.get(position);
                ItemSolar copiaItem = new ItemSolar(originalItem.getNombre() + " (Copia)", originalItem.getImagen());
                datos.add(position + 1, copiaItem);
                notifyItemInserted(position + 1);
                return true;
            }else if (item1.getItemId() == R.id.eliminarMenu) {
                datos.remove(position);
                notifyItemRemoved(position);
                return true;
            }
            return false;
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}