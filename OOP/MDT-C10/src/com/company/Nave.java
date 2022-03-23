package com.company;

public class Nave extends Objeto {
    private Integer vida;
    private Double velocidad;

    public Nave(Integer posx, Integer posy, char direccion)
    {
        super(posx, posy, direccion);
        this.velocidad = 299_792.458;
        this.vida = 300;
    }


    public void girar(char direccion)
    {
        super.direccion = direccion;
    }

    public void restarVida(Integer valor)
    {
        this.vida = this.vida - valor;
    }

}
