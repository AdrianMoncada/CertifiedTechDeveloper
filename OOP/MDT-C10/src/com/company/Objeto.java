package com.company;

public class Objeto {
    protected Character direccion;
    private Integer posx;
    private Integer posy;

    public Objeto(Integer posx, Integer posy, char direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(Integer x, Integer y, char direccion){
        System.out.println("El objeto se dirigirá a: " + x + " " + y + " " + direccion);
    }
}
