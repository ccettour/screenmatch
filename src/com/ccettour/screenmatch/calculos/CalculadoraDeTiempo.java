package com.ccettour.screenmatch.calculos;

import com.ccettour.screenmatch.modelos.Pelicula;
import com.ccettour.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
