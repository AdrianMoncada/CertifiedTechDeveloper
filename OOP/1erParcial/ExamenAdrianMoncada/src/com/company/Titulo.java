package com.company;

public abstract class Titulo {
    private Persona persona;
    private Integer cantidadMaterias;
    private String fechaInicio;
    private String fechaFinalizacion;
    private Boolean selladoMinisterio;
    private Boolean selladoInstituto;

    public Titulo(Persona persona, Integer cantidadMaterias, String fechaInicio, String fechaFinalizacion, Boolean selladoMinisterio, Boolean selladoInstituto) {
        this.persona = persona;
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
    }

    public Boolean sePuedeEjercer(){
        if(selladoInstituto == true && selladoMinisterio == true){
            System.out.println("Se puede ejercer ya que cuenta con ambos sellos.");
            return true;
        }
        System.out.println("No se puede ejercer ya que adeuda uno o ambos sellos");
        return false;
    }
}
