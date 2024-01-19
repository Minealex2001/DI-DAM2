package com.alejandro.ejercicio2.fragments;

import android.os.Bundle;

import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alejandro.ejercicio2.R;
import com.alejandro.ejercicio2.models.Card;
import com.alejandro.ejercicio2.models.CardAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_gallery#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_gallery extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_gallery() {
        // Required empty public constructor
    }

    public static fragment_gallery newInstance(String param1, String param2) {
        fragment_gallery fragment = new fragment_gallery();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Card> datos = new ArrayList<Card>(){{
            add(new Card(R.drawable.image1, "Imagen 1"));
            add(new Card(R.drawable.image2, "Imagen 2"));
            add(new Card(R.drawable.image3, "Imagen 3"));
            add(new Card(R.drawable.image4, "Imagen 4"));
            add(new Card(R.drawable.image5, "Imagen 5"));
            add(new Card(R.drawable.image6, "Imagen 6"));
            add(new Card(R.drawable.image7, "Imagen 7"));
            add(new Card(R.drawable.image8, "Imagen 8"));
            add(new Card(R.drawable.image9, "Imagen 9"));
        }};

            RecyclerView recyclerView = requireView().findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
            CardAdapter adaptador = new CardAdapter(datos);

            recyclerView.setAdapter(adaptador);
    }
}