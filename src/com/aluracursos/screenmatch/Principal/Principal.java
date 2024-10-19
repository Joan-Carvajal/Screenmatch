package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.models.Episodio;
import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);


        
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestaFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println("evaluaciones: "+miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon",2022);



        casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodios(10);
        casaDragon.muestaFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1998);


        otraPelicula.setDuracionEnMinutos(180);

        otraPelicula.muestaFichaTecnica();
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones " +calculadora.getTiempoTotal()+ " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVizulizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();

        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());

        System.out.println("La Primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

        System.out.println("toSring de la pelicula: "+ listaDePeliculas.get(0).toString());
    }
}
