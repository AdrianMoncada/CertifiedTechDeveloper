package com.company;

public class Cliente {

    private Integer numeroCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(Integer numeroCliente, String apellido, String dni, String cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
