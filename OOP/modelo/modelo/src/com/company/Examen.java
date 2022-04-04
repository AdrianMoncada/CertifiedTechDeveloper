package com.company;

public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private Integer notaEscrita;

    public Examen(Alumno alumno, String titulo, String enunciado, Integer notaEscrita) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.notaEscrita = notaEscrita;
    }

    public Boolean estaAprobado() {
        if (notaEscrita >= 4) {
            System.out.println("Aprobo el examen");
            return true;
        } else {
            System.out.println("Examen desaprobado");
            return false;
        }
    }


    public Integer getNotaEscrita() {
        return notaEscrita;
    }


}


