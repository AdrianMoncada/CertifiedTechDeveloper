package com.company;

public class Velero extends embarcacion implements Evaluable{
    private Integer cantidadVeleros;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Integer eslora, Integer cantidadVeleros) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadVeleros = cantidadVeleros;
    }

    @Override
    public void evaluar() {
        if(cantidadVeleros > 4){
            System.out.println("Este velero es considerado grande");
        } else {
            System.out.println("Este velero no es considerado grande");
        }
    }
}
