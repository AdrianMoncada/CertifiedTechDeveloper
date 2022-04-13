package com.company;

public class Recorrido {
    private Estacion estacionDestino;
    private Estacion estacionPartida;

    public Recorrido(Estacion estacionDestino, Estacion estacionPartida) {
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino.getNombre();
    }

    public String getEstacionPartida() {
        return estacionPartida.getNombre();
    }

    @Override
    public String toString() {
        return estacionDestino.toString() + " " + estacionPartida.toString();
    }
}
