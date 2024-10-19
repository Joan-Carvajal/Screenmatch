package com.aluracursos.screenmatch.models;

public class Serie extends Titulo {
    int temporada;
    int episodios;
    int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    @Override
    public int getDuracionEnMinutos() {
        return temporada * episodios * minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return  "Serie: "+ this.getNombre() + " ("+ this.getFechaDeLanzamiento()+")";
    }
}
