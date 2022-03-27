package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Carpincho("Tincho",300.0,"Marron");

        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry",500.0,"Azul Marino");

        animal = new Ornitorrinco("Paco",100.0,"Verde");

        Ornitorrinco ornitorrinco1 = (Ornitorrinco) animal;

        ornitorrinco.ponerHuevo();
        ornitorrinco1.ponerHuevo();

    }
}
