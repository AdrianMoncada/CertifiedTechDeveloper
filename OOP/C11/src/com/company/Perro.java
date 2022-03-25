package com.company;

public class Perro extends Animal {
    public Perro(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Woof!");
    }


}
