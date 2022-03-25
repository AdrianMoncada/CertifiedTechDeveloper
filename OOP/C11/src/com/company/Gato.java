package com.company;

public class Gato extends Animal{
    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }

}
