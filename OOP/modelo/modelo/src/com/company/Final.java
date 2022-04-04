package com.company;

public class Final extends Examen implements Comparable{
    private Integer notaOral;
    private String descripcionTema;

    public Final(Alumno alumno, String titulo, String enunciado, Integer notaEscrita, Integer notaOral, String descripcionTema) {
        super(alumno, titulo, enunciado, notaEscrita);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }

    public double calcularPromedio() {
        return (this.getNotaEscrita() + this.notaOral) / 2;
    }

    @Override
    public int compareTo(Object object) {
        Final otroFinal = (Final) object;
        double promedio = this.calcularPromedio();
        double promedioAComparar = otroFinal.calcularPromedio();
        if (promedio > promedioAComparar) {
            return 1;
        } else if (promedio < promedioAComparar) {
            return -1;
        }

        return 0;

    }

}
