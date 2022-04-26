package com.company;

public class Rectangulo implements Figura{
    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double caluclarArea() {
        return alto * largo;
    }
}
