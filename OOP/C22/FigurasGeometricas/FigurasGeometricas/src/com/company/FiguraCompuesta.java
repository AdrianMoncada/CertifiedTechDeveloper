package com.company;

import java.util.List;
import java.util.ArrayList;

public class FiguraCompuesta implements Figura{
    private List<Figura> figuras;

    public FiguraCompuesta() {
        this.figuras = new ArrayList<>();
    }

    @Override
    public Double caluclarArea() {
        Double areaTotal = 0.0;
        for (Figura figura : figuras) {
            areaTotal += figura.caluclarArea();
        }
        return areaTotal;
    }

    public void agregarFigura(Figura figura){
        figuras.add(figura);
    }

    public void removerFigura(Figura figura){
        figuras.remove(figura);
    }
}
