package com.company;

public class RobotPesado extends SistemaArmas implements Atacar, Defender, Volar  {
    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void Atacar() {
        System.out.println("Robot Pesado ataca");
    }

    @Override
    public void Defender() {
        System.out.println("Robot Pesado defiende");
    }

    @Override
    public void Volar() {
        System.out.println("Robot pesado vuela");
    }
}
