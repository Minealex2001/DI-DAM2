package com.alejandro.practica5_2_3.entity;

public class Planeta {

    private String planeta;
    private double diametro;
    private double distanciaSol;
    private double densidad;

    public Planeta(String planeta, double diametro, double distanciaSol, double densidad) {
        this.planeta = planeta;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.densidad = densidad;
    }

    public Planeta() {}

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }
}