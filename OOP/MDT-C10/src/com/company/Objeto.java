package com.company;

public class Objeto {
    protected String direccion;
    private Integer posx;
    private Integer posy;

    public Objeto(Integer posx, Integer posy, String direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(Integer x, Integer y, String direccion){
        System.out.println("El objeto se dirigirá a: " + x + " " + y + " " + direccion);
    }
}
