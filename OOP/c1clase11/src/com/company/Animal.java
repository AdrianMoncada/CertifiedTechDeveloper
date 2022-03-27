package com.company;

import java.util.Objects;

public abstract class Animal {

    private String nombre;
    private Double energia;
    private String color;

    public Animal(String nombre, Double energia, String color) {
        this.nombre = nombre;
        this.energia = energia;
        this.color = color;
    }

    public abstract void hacerRuido();

    public void comer(Double pesoComida){
        //energia = energia + pesoComida;
        this.energia += pesoComida;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, energia, color);
    }
}
