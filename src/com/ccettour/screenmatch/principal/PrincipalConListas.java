package com.ccettour.screenmatch.principal;

import com.ccettour.screenmatch.modelos.Pelicula;
import com.ccettour.screenmatch.modelos.Serie;
import com.ccettour.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nombre: " +item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: " +pelicula.getClasificacion());
            }
        }

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");

        System.out.println("Lista de artistas no ordenada: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);

        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);

        System.out.println("Lista de películas ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);
    }
}
