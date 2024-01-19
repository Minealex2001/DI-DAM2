package com.alejandro.ejercicio2.models;

import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.alejandro.ejercicio2.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private List<Card> datos;

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView titulo;
        private ActionMode actionMode;

        public CardViewHolder(View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.item_imagen);
            titulo = itemView.findViewById(R.id.nombreCard);
        }

        public void bindCard(Card c) {
            imagen.setImageResource(c.getImagen());
            titulo.setText(c.getTitulo());
        }

        public void toggleSelection() {
            itemView.setSelected(!itemView.isSelected());
        }
    }

    public CardAdapter(List<Card> datos) {
        this.datos = datos;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.bindCard(datos.get(position));

        holder.imagen.setOnCreateContextMenuListener((menu, v, menuInfo) -> {
            MenuInflater inflater = new MenuInflater(v.getContext());
            inflater.inflate(R.menu.contextmenu, menu);
        });

        holder.imagen.setOnLongClickListener(v -> {
            if (holder.actionMode == null) {
                holder.actionMode = v.startActionMode(new ActionModeCallback());
            }
            holder.toggleSelection();
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}