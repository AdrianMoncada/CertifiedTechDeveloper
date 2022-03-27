package com.company;

public class Ornitorrinco extends Animal {

    private Integer cantidadDeHijos;

    public Ornitorrinco(String nombre, Double energia, String color) {
        super(nombre, energia, color);
        cantidadDeHijos = 0;
    }

    public void ponerHuevo(){
        cantidadDeHijos++;
        System.out.println("soy " + getNombre()  + " puse un huevo");
    }

    @Override
    public void hacerRuido() {
        System.out.println("grrrr rr rr rr");
    }
}
