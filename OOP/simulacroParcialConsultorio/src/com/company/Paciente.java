package com.company;

public abstract class Paciente {
    private Consulta consulta;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primerConsulta;

    public Paciente(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Boolean primerConsulta) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primerConsulta = primerConsulta;
    }

    public Boolean evaluacionClinicaInicial(){
        if(primerConsulta == true){
            System.out.println("Es la primera consulta del paciente. Debe de realizarse su evaluación clínica inicial.");
            return true;
        }
        System.out.println("No es la primera consulta del paciente. Puede consultar su historial clínico");
        return false;
    }
}
