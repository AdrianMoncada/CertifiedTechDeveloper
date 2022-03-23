package com.company;

import java.net.IDN;

public class Nave extends Objeto {
    private Integer vida;
    private Double velocidad;

    public Nave(Integer posx, Integer posy, String direccion)
    {
        super(posx, posy, direccion);
        this.velocidad = 299_792.458;
        this.vida = 300;
    }


    public void girar(String direccion)
    {
        super.direccion = direccion;
    }

    public void restarVida(Integer valor)
    {
        this.vida = this.vida - valor;
    }

}
