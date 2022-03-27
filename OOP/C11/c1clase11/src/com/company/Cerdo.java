package com.company;

public class Cerdo extends Animal {

    public Cerdo(String nombre, Double energia, String color) {
        super(nombre, energia, color);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Oink");
    }
}
