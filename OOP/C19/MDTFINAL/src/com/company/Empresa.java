package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Reserva> reservas;
    private String nombre;

    public Empresa(String nombre) {
        reservas = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public Double recaudacionTotal(){
        Double total = 0.0;
        for (Reserva reserva : reservas) {
            total += reserva.calcularPrecioReserva();
        }
        System.out.println("El total de la recaudación es: " + total);
        return total;
    }

    public Integer cantidadVecesRecorrida(String estacion) throws EmpresaException{
        if(!getEstacionesValidas().contains(estacion)){
            throw new EmpresaException(estacion + " no es una estación válida");
        }
        Integer cantidadVeces = 0;
        for (Reserva reserva : reservas) {
            if(reserva.toString().contains(estacion)){
                cantidadVeces++;
            }
        }
        return cantidadVeces;
    }

    private List<String> getEstacionesValidas(){
        List<String> estacionesValidas = new ArrayList<>();
        estacionesValidas.add("Buenos Aires");
        estacionesValidas.add("Luján");
        estacionesValidas.add("Mercedes");
        estacionesValidas.add("Suipacha");
        estacionesValidas.add("Chivilcoy");
        estacionesValidas.add("Alberti");
        estacionesValidas.add("Bragado");
        return estacionesValidas;
    }
}
