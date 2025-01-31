package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Serie serie;
    private  int totalVizulizaciones;

    public int getTotalVizulizaciones() {
        return totalVizulizaciones;
    }

    public void setTotalVizulizaciones(int totalVizulizaciones) {
        this.totalVizulizaciones = totalVizulizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalVizulizaciones> 100){
        return 4;
        }else {
            return 2;
        }
    }
}
