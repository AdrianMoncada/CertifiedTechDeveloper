package com.company;

public class RobotLiviano extends SistemaArmas implements Atacar, Defender, Volar{
    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void Atacar() {
        System.out.println("Robot Liviano ataca");
    }

    @Override
    public void Defender() {
        System.out.println("Robot Liviano defiende");
    }

    @Override
    public void Volar() {
        System.out.println("Robot Liviano vuela");
    }
}
