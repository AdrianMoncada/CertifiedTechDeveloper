package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private List<Figura> componentes;

    public Tren() {
        this.componentes = new ArrayList<>();
    }


    public Double calcularAreaTren() {
        Double areaTotal = 0.0;
        for (Figura figura : componentes) {
            areaTotal += figura.caluclarArea();
        }
        return areaTotal;
    }

    public void agregarFigura(Figura figura){
        componentes.add(figura);
    }

    public void removerFigura(Figura figura){
        componentes.remove(figura);
    }
}
