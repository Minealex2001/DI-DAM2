package com.alejandro.practica5_4;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantCardViewHolder> {

    private final List<String> names;
    private final List<String> locations;
    private final List<Integer> images;
    private final List<Float> ratings;

    public RestaurantAdapter(List<String> names, List<String> locations, List<Integer> images, List<Float> ratings) {
        this.names = names;
        this.locations = locations;
        this.images = images;
        this.ratings = ratings;
    }

    public static class RestaurantCardViewHolder extends RecyclerView.ViewHolder {
        TextView restaurantName;
        ImageView restaurantImage;
        RatingBar restaurantRatingBar;
        TextView restaurantRating;
        TextView restaurantLocation;

        public RestaurantCardViewHolder(View View) {
            super(View);
            restaurantName = View.findViewById(R.id.nombre_comida);
            restaurantImage = View.findViewById(R.id.imagen_restaurante);
            restaurantRatingBar = View.findViewById(R.id.ratingBar);
            restaurantRating = View.findViewById(R.id.ratingScore);
            restaurantLocation = View.findViewById(R.id.direccion);

            itemView.findViewById(R.id.reservar).setOnClickListener(v ->
                    Toast.makeText(itemView.getContext(), "Reserved in " + restaurantName.getText(), Toast.LENGTH_SHORT).show());
        }
    }

    @NonNull
    @Override
    public RestaurantCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);
        return new RestaurantCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantCardViewHolder holder, int position) {
        holder.restaurantName.setText(names.get(position));
        holder.restaurantImage.setImageResource(images.get(position));
        holder.restaurantLocation.setText(locations.get(position));
        holder.restaurantRatingBar.setRating(ratings.get(position));
        holder.restaurantRating.setVisibility(View.GONE);
        holder.restaurantRating.setText(String.valueOf(ratings.get(position)));

        ((View) holder.restaurantRatingBar).setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                holder.restaurantRating.setVisibility(View.VISIBLE);
            }
            v.performClick();
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
