package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Puerto BuenosAires = new Puerto();

        BuenosAires.agregarContenedor(new Contenedor(2, "Brasil", false));
        BuenosAires.agregarContenedor(new Contenedor(4, "China", true));
        BuenosAires.agregarContenedor(new Contenedor(6, "Rusia", true));
        BuenosAires.agregarContenedor(new Contenedor(5, "EEUU", false));
        BuenosAires.agregarContenedor(new Contenedor(8, "Desconocida", true));
        BuenosAires.agregarContenedor(new Contenedor(7, "Desconocida", true));

        BuenosAires.mostrarContenedoresOrdenados();
        System.out.println(BuenosAires.cantidadContenedoresPeligrosos());
    }
}
