package com.example.di_dam2.about;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.di_dam2.R;

import java.util.List;

public class AboutAdapter extends RecyclerView.Adapter<AboutViewHolder> {

    private final List<Integer> imageList;
    private final List<String> titleList;
    private final List<String> subtitleList;
    private final Context context;

    public AboutAdapter(List<Integer> imageList, List<String> titleList, List<String> subtitleList, Context context){
        this.imageList = imageList;
        this.titleList = titleList;
        this.subtitleList = subtitleList;
        this.context = context;
    }
    @NonNull
    @Override
    public AboutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.about_viewholder_layout, parent, false);
        return new AboutViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutViewHolder holder, int position) {
        String name = titleList.get(position);
        int imageId = imageList.get(position);
        String year = subtitleList.get(position);

        holder.title.setText(name);
        holder.subtitle.setText(year);
        holder.image.setImageResource(imageId);

        holder.layout.setOnClickListener(v -> Toast.makeText(context, name, Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return imageList != null && titleList != null && subtitleList != null ? imageList.size() : 0;
    }
}
