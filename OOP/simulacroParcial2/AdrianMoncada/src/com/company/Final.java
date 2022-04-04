package com.company;

public class Final extends Examen implements Comparable {
    private Double notaOral;
    private String descripcionOral;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public int compareTo(Object o) {
        Final otroFinal = (Final)o;
        if(this.promedio() > otroFinal.promedio()){
            System.out.println("Es mayor");
            return 1;
        }
        if(this.promedio() < otroFinal.promedio()){
            System.out.println("Es menor");
            return -1;
        }
        System.out.println("Son iguales");
        return 0;
    }

    public Double promedio(){
        return (getNota() + notaOral) / 2;
    }
}
