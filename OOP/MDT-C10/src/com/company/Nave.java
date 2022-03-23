package com.company;

import java.net.IDN;

public class Nave extends Objeto {
    private Integer vida;
    private Double velocidad;

    public Nave(Integer posx, Integer posy, Character direccion, Double velocidad){
        super(posx, posy, direccion);
        this.velocidad = 100000.0;
        this.vida = 300;
    }

    public void girar(Character direccion){
        super.direccion = direccion;
    }

    public void restarVida(Integer valor){
        this.vida = this.vida - valor;
    }

}
