package com.company;

public class Tanque extends SistemaArmas implements Atacar, Defender{

    public Tanque(Integer energia) {
        super(energia);
    }

    @Override
    public void Atacar() {
        System.out.println("Ataca!");
    }

    @Override
    public void Defender() {
        System.out.println("Defiende!");
    }
}
