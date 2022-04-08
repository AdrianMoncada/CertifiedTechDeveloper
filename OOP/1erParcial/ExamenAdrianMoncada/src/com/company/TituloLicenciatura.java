package com.company;

public class TituloLicenciatura extends Titulo implements Comparable {
    private String temaTesis;
    private String fechaEntrega;
    private Integer cantidadTrabajosInvestigacion;

    public TituloLicenciatura(Persona persona, Integer cantidadMaterias, String fechaInicio, String fechaFinalizacion, Boolean selladoMinisterio, Boolean selladoInstituto, String temaTesis, String fechaEntrega, Integer cantidadTrabajosInvestigacion) {
        super(persona, cantidadMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.cantidadTrabajosInvestigacion = cantidadTrabajosInvestigacion;
    }

    @Override
    public int compareTo(Object o) {
        TituloLicenciatura otroTituloLicenciatura = (TituloLicenciatura)o;
        if(this.cantidadTrabajosInvestigacion > otroTituloLicenciatura.cantidadTrabajosInvestigacion){
            System.out.println("Es mayor");
            return 1;
        }
        if(this.cantidadTrabajosInvestigacion < otroTituloLicenciatura.cantidadTrabajosInvestigacion){
            System.out.println("Es menor");
            return -1;
        }
        System.out.println("Son iguales");
        return 0;
    }
}
