package com.company;

public class Circulo implements Figura{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double caluclarArea() {
        return radio*radio*Math.PI;
    }
}
