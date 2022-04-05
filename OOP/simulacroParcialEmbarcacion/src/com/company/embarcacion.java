package com.company;

public abstract class embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Integer eslora;

    public embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Integer eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double calcularAlquiler(){
        if(anioFabricacion > 2020){
            return precioBase + (precioBase * 0.7);
        }
        return precioBase;
    }
}
