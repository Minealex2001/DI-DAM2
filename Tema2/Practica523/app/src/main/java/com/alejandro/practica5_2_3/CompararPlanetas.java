package com.alejandro.practica5_2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.alejandro.practica5_2_3.databinding.CompararPlanetasBinding;
import com.alejandro.practica5_2_3.entity.Planeta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompararPlanetas extends AppCompatActivity {

    CompararPlanetasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = CompararPlanetasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Planeta> listaPlanetas = new ArrayList<>();
        listaPlanetas.add(new Planeta("Mercurio", 0.382, 57.9, 5.43));
        listaPlanetas.add(new Planeta("Venus", 0.949, 108.2, 5.24));
        listaPlanetas.add(new Planeta("Tierra", 1, 149.6, 5.52));
        listaPlanetas.add(new Planeta("Marte", 0.53, 227.9, 3.94));
        listaPlanetas.add(new Planeta("Jupiter", 11.2, 778.6, 1.33));
        listaPlanetas.add(new Planeta("Saturno", 9.41, 1433.5, 0.69));
        listaPlanetas.add(new Planeta("Urano", 3.38, 2872.5, 1.27));
        listaPlanetas.add(new Planeta("Neptuno", 3.81, 4495.1, 1.64));
        listaPlanetas.add(new Planeta("Pluton", 0, 5906.4, 2.03));

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,
                listaPlanetas.stream().map(Planeta::getPlaneta).collect(Collectors.toList()));

        binding.autoCompleteTextViewplaneta1.setAdapter(adaptador);
        binding.autoCompleteTextViewplaneta2.setAdapter(adaptador);

        binding.autoCompleteTextViewplaneta1.setOnItemClickListener((parent, view, position, id) -> listaPlanetas.forEach(planeta -> {
            if (planeta.getPlaneta().equals(binding.autoCompleteTextViewplaneta1.getText().toString())){
                binding.diametro1.setText(planeta.getDiametro() + "");
                binding.distancia1.setText(planeta.getDistanciaSol() + "");
                binding.densidad1.setText(planeta.getDensidad() + "");
            }
        }));

        binding.autoCompleteTextViewplaneta2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listaPlanetas.forEach(planeta -> {
                    if (planeta.getPlaneta().equals(binding.autoCompleteTextViewplaneta2.getText().toString())){
                        binding.diametro2.setText(planeta.getDiametro() + "");
                        binding.distancia2.setText(planeta.getDistanciaSol() + "");
                        binding.densidad2.setText(planeta.getDensidad() + "");
                    }
                });
            }
        });
    }
}