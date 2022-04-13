package com.company;
public class Main {
    public static void main(String[] args) {
        Estacion buenosAires = new Estacion("Buenos Aires");
        Estacion bragado = new Estacion("Bragado");
        Estacion lujan = new Estacion("Luján");
        Estacion mercedes = new Estacion("Mercedes");

        Reserva reserva1 = new Reserva("2040", new Recorrido(buenosAires, mercedes),2);
        Reserva reserva2 = new Reserva("2040", new Recorrido(lujan, buenosAires), 2);
        reserva1.calcularPrecioReserva();
        Empresa empresaRandom = new Empresa("Random Inc");

        empresaRandom.agregarReserva(reserva1);
        empresaRandom.agregarReserva(reserva2);
        empresaRandom.recaudacionTotal();
        try{
            System.out.println(empresaRandom.cantidadVecesRecorrida("Bragado"));
        } catch (EmpresaException e){
            e.printStackTrace();
        }
    }
}