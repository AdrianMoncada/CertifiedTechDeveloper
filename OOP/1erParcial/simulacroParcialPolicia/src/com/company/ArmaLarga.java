package com.company;

public class ArmaLarga extends Arma implements Comparable {
    private Boolean selloRenar;
    private String justificacionUso;
    private Integer nivelArma;

    public ArmaLarga(Policia policia, Integer municionesSoportadas, Integer alcanceAproxMts, String marca, Integer calibre, String estado, Boolean selloRenar, String justificacionUso, Integer nivelArma) {
        super(policia, municionesSoportadas, alcanceAproxMts, marca, calibre, estado);
        this.selloRenar = selloRenar;
        this.justificacionUso = justificacionUso;
        this.nivelArma = nivelArma;
    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga otraArmaLarga = (ArmaLarga)o;
        if(this.nivelArma > otraArmaLarga.nivelArma){
            System.out.println("Esta arma es mayor");
            return 1;
        }
        if(this.nivelArma < otraArmaLarga.nivelArma){
            System.out.println("Esta arma es menor");
            return -1;
        }
        System.out.println("Estas armas son iguales");
        return 0;
    }
}
