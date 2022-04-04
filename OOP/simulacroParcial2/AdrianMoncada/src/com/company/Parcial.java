package com.company;

public class Parcial extends Examen{
    private Integer numeroUnidad;
    private Integer numeroReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer numeroUnidad) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintentos = 0;
    }

    public Boolean puedeRecuperarse(){
        if(!super.estaAprobado()){
            setearReintentos();
            System.out.println("te quedan: " + numeroReintentos + " intentos");
            return true;
        }
        System.out.println("Aprobaste este examen, no necesitas recuperarlo.");
        return false;
    }

    public void setearReintentos(){
        if (numeroUnidad <= 3){
            numeroReintentos = 3;
        } else {
            numeroReintentos = 2;
        }
    }



}
