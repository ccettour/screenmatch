package com.ccettour.screenmatch.principal;

import com.ccettour.screenmatch.calculos.CalculadoraDeTiempo;
import com.ccettour.screenmatch.calculos.FiltroRecomendacion;
import com.ccettour.screenmatch.modelos.Episodio;
import com.ccettour.screenmatch.modelos.Pelicula;
import com.ccettour.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        /*miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(10);
        miPelicula.evalua(8);*/

        /*System.out.println("El total de las evaluaciones es: " +
                miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("La media es: " +
                miPelicula.calculaMedia());*/


        Serie casaDragon = new Serie("La casa del dragón",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(10);
        //casaDragon.muestraFichaTecnica();
        //System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.setDuracionEnMinutos(180);

        //otraPelicula.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicula);
        calculadora.incluye(casaDragon);
        /*System.out.println("Tiempo necesario para ver tus " +
                "títulos favoritos estas vacaciones: " +
                calculadora.getTiempoTotal() + " minutos");*/

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        //filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        //filtroRecomendacion.filtro(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: "+ listaDePeliculas.size());
        //System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());


        for (int i = 0; i < listaDePeliculas.size(); i++) {
            System.out.println("toString de la película: " + listaDePeliculas.get(i).toString());
        }

        System.out.println(listaDePeliculas);

        Object objeto = peliculaDeBruno;



    }
}
