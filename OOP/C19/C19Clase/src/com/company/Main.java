package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo = new Equipo("Isotpos de Springfield");

        equipo.agregarJugador();



        try {
            System.out.println(equipo.cantidadJugadores("DEFENSOR"));
        } catch (EquipoException e) {
            e.printStackTrace();
        }

        System.out.println(equipo.obtenerReservas());
    }
}
