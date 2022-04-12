package com.company;

public class Contenedor implements Comparable<Contenedor> {

    private Integer identificador;
    private String procedencia;
    private Boolean materialPeligroso;

    public Contenedor(Integer identificador, String procedencia, Boolean materialPeligroso) {
        this.identificador = identificador;
        this.procedencia = procedencia;
        this.materialPeligroso = materialPeligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        if (this.identificador > o.identificador) {
            return 1;
        }
        if (this.identificador < o.identificador) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "identificador=" + identificador +
                ", procedencia='" + procedencia + '\'' +
                ", materialPeligroso=" + materialPeligroso +
                '}';
    }

    public String getProcedencia() {
        return procedencia;
    }

    public Boolean getMaterialPeligroso() {
        return materialPeligroso;
    }
}
