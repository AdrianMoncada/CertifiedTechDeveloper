package com.company;

public class Main {

    public static void main(String[] args) {
        Capitan adrian = new Capitan("Adrián","Moncada","356BBVA");

        Velero alba = new Velero(adrian,40000.0, 5000.0, 2019, 85,5);

        alba.evaluar();
        alba.calcularAlquiler();

        Yate eclipse = new Yate(adrian, 200000.0, 20000.0,2022,170,4);
        eclipse.vender();

        Yate octopus = new Yate(adrian,400000.0,40000.0,2022,300,8);
        octopus.compareTo(eclipse);
        eclipse.compareTo(octopus);
    }
}
