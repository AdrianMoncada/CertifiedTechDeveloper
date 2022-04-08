package com.company;

public class TituloTerciario extends Titulo{
    private String validacion;

    public TituloTerciario(Persona persona, Integer cantidadMaterias, String fechaInicio, String fechaFinalizacion, Boolean selladoMinisterio, Boolean selladoInstituto, String validacion) {
        super(persona, cantidadMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto);
        this.validacion = validacion;
    }

    public Boolean esValidoNacional(){
        if(validacion == "NACIONAL"){
            System.out.println("Este título es válido a nivel nacional");
            return true;
        }
        System.out.println("Este título no es válido a nivel nacional");
        return false;
    }
}
