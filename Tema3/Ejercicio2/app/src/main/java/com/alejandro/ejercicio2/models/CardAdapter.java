package com.alejandro.ejercicio2.models;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.alejandro.ejercicio2.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{
    private List<Card> datos;

    public static class CardViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagen;
        private TextView titulo;

        public CardViewHolder(View itemView){
            super(itemView);
            imagen = itemView.findViewById(R.id.item_imagen);
            titulo = itemView.findViewById(R.id.nombreCard);
        }

        public void bindCard(Card c){
            imagen.setImageResource(c.getImagen());
            titulo.setText(c.getTitulo());
        }
    }

    public CardAdapter(List<Card> datos){
        this.datos = datos;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position){
        holder.bindCard(datos.get(position));
        Button cancelar = holder.itemView.findViewById(R.id.cancel);

        cancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                datos.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount(){
        return datos.size();
    }
}