package com.company;

public class Particular extends Paciente{
    private Double cobroConsulta;
    private String dni;

    public Particular(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Boolean primerConsulta, Double cobroConsulta, String dni) {
        super(consulta, fechaNacimiento, nombre, apellido, primerConsulta);
        this.cobroConsulta = cobroConsulta;
        this.dni = dni;
    }
}
