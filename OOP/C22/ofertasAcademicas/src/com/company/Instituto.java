package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
      //      System.out.println("nombre: " +ofertaAcademica.getNombre() + " precio: " + ofertaAcademica.calcularPrecio());
            System.out.println(ofertaAcademica);
        }
    }
}
