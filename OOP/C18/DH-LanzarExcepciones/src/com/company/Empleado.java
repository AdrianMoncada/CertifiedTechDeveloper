package com.company;

public class Empleado {

    private String nombre;
    private String apellido;
    private float sueldo;
    public Empleado(String nombre, String apellido, float sueldo){
        if(sueldo < 0)
            throw new RuntimeException("Sueldo no puede ser menor a cero");
        if(apellido == null)
            throw new RuntimeException("Apellido no puede estar vacío");
        if(nombre == null)
            throw new RuntimeException("Nombre no puede estar vacío");
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
    }
}
