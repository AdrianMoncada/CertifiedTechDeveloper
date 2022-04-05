package com.company;

public class Main {

    public static void main(String[] args) {
	Policia pedroSanchez = new Policia("Pedro", "Sanchez", "123456");
    ArmaLarga escopeta = new ArmaLarga(pedroSanchez,12,80,"Magnum",9,"EN USO", true,"Disturbios",5);
    ArmaLarga rifle = new ArmaLarga(pedroSanchez,12,80,"Magnum",11,"EN USO", true,"Disturbios",5);
    escopeta.puedeSerUsada();
    rifle.compareTo(escopeta);


    }
}
