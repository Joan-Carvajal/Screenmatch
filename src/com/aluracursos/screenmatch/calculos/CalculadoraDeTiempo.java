package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void  incluye(Titulo titulo){
        this.tiempoTotal+= titulo.getDuracionEnMinutos();
    }


    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
