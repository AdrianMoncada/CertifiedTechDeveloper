package com.company;

public class ArmaCorta extends Arma{
    private Boolean automatica;

    public ArmaCorta(Policia policia, Integer municionesSoportadas, Integer alcanceAproxMts, String marca, Integer calibre, String estado, Boolean automatica) {
        super(policia, municionesSoportadas, alcanceAproxMts, marca, calibre, estado);
        this.automatica = automatica;
    }

    public Boolean disparoMayorDoscientos(){
        if(getAlcanceAproxMts() > 200){
            System.out.println("El alcance de esta arma es mayor a 200");
            return true;
        }
        System.out.println("El alcance de esta arma es menor a 200");
        return false;
    }
}
