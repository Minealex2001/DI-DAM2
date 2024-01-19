package com.alejandro.ejercicio2.models;

public class Card {
    private int imagen;
    private String titulo;
    private boolean isSelected;

    public Card(int imagen, String titulo){
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public int getImagen(){
        return imagen;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setImagen(int imagen){
        this.imagen = imagen;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public boolean isSelected() {
        return isSelected;
    }


    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}