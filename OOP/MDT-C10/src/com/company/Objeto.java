package com.company;

public class Objeto {
    protected Character direccion;
    private Integer posx;
    private Integer posy;

    public Objeto(Integer posx, Integer posy, Character direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(Integer x, Integer y, Character direccion){
        System.out.println(x + " " + y + " " + direccion);
    }
}
