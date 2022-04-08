package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException {
        Date hoy= new Date();
        this.historiaClinica=historiaClinica;
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            throw new PacienteException("La fecha de internación asignada no puede ser en el futuro");
            this.fechaInternacion=fechaInternacion;
    }

    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion, Date fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.historiaClinica = historiaClinica;
        this.fechaInternacion = fechaInternacion;
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            throw new PacienteException("la fecha de alta debe ser posterior al día de la internación");

    }



}
