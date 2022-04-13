package com.company;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String codigo;
    private Recorrido recorrido;
    private Integer cantidadPersonas;
    private Double precioReserva;


    public Reserva(String codigo, Recorrido recorrido, Integer cantidadPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantidadPersonas = cantidadPersonas;
    }

    public Double calcularPrecioReserva(){
        String partida = recorrido.getEstacionPartida();
        String destino = recorrido.getEstacionDestino();
        Double precio = cantidadPersonas * 50.0;
        if(destino.equals("Buenos Aires") && partida.contains("Bragado")
                || destino.contains("Bragado") && partida.contains("Buenos Aires")){
            return this.precioReserva = precio * 0.8;
        }
            return this.precioReserva = precio;
    }

    public Double getPrecio() {
        System.out.println(precioReserva);
        return precioReserva;
    }

    @Override
    public String toString() {
        return recorrido.toString();
    }


}
