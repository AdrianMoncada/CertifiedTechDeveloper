package com.company;

public class PacienteConObraSocial extends Paciente implements Comparable {
    private String nombreObraSocial;
    private Integer nroAsociado;

    public PacienteConObraSocial(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Boolean primerConsulta, String nombreObraSocial, Integer nroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, primerConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.nroAsociado = nroAsociado;
    }

    @Override
    public int compareTo(Object o) {
        PacienteConObraSocial otroPacienteConObraSocial = (PacienteConObraSocial)o;
        if(this.nroAsociado > otroPacienteConObraSocial.nroAsociado){
            System.out.println("Es mayor");
            return 1;
        }
        if(this.nroAsociado < otroPacienteConObraSocial.nroAsociado){
            System.out.println("Es menor");
            return -1;
        }
        System.out.println("Son iguales");
        return 0;
    }
}
