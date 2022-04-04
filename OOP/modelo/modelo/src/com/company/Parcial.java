package com.company;

public class Parcial extends Examen {
    private Integer numeroDeUnidad;
    private Integer numeroDeIntentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Integer notaEscrita, Integer numeroDeUnidad, Integer numeroDeIntentos) {
        super(alumno, titulo, enunciado, notaEscrita);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeIntentos = numeroDeIntentos;
    }

    public Boolean seguirRecuperando(){
        if(estaAprobado() == false){
            if (numeroDeUnidad<=3 & numeroDeIntentos<=3){
                System.out.println("puede recuperar hasta 3 veces");
                return true;
            }else if(numeroDeUnidad<=2 & numeroDeIntentos<3){
                System.out.println("puede recuperar hasta 2 veces");
                return true;
            }
            else{
                System.out.println("ya no puede recuperar");
                return false;
            }
        }else{
            System.out.println("el examen esta aprobado");
        }

        return false;
    }




    public Integer getNumeroDeIntentos() {
        return numeroDeIntentos;
    }
}
