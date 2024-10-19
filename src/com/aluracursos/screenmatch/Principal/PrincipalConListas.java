package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Titulo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
            peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon",2022);

        List<Titulo> lista = new ArrayList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2) {
            System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada "+listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de artistas ordenada "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista Ordenada por fecha "+lista);
        /* Sin embargo, a partir de Java 8, se agregó a la interface List (la cual la clase ArrayList implementa) un nuevo método llamado forEach, que permite iterar sobre los elementos de la lista de una manera más concisa y elegante. Por ejemplo, el ejemplo anterior se puede reescribir usando el método forEach de la siguiente manera:*/
//        nombres.forEach(nombre -> System.out.println(nombre));
//        Es posible simplificar aún más el ejemplo de código anterior utilizando el recurso conocido como Method Reference, que no es más que una forma reducida de una expresión lambda:

//        nombres.forEach(System.out::println);

    }
}
