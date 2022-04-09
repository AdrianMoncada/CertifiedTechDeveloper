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
            throw new PacienteException("La fecha de internación asignada no puede ser posterior al día de hoy");
            this.fechaInternacion=fechaInternacion;
    }

    public Date getFechaInternacion() {
        System.out.println("El paciente fué internado el día: " + fechaInternacion);
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        System.out.println("La fecha de alta del paciente es el día:" + fechaAlta);
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException {
        if (fechaAlta.after(fechaInternacion))
            this.fechaAlta = fechaAlta;
        else
            throw new PacienteException("la fecha de alta debe ser posterior al día de la internación");

    }



}
