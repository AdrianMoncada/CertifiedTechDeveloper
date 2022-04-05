package com.company;

public abstract class Arma {
    private Policia policia;
    private Integer municionesSoportadas;
    private Integer alcanceAproxMts;
    private String marca;
    private Integer calibre;
    private String estado;

    public Arma(Policia policia, Integer municionesSoportadas, Integer alcanceAproxMts, String marca, Integer calibre, String estado) {
        this.policia = policia;
        this.municionesSoportadas = municionesSoportadas;
        this.alcanceAproxMts = alcanceAproxMts;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Boolean puedeSerUsada(){
        if(getCalibre() > 9){
            System.out.println("No puede ser usada");
            return true;
        }
        System.out.println("Si puede ser usada");
        return false;
    }

    public Integer getAlcanceAproxMts() {
        return alcanceAproxMts;
    }

    public Integer getCalibre() {
        return calibre;
    }
}
