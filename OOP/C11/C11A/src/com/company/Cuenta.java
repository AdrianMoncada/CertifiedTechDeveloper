package com.company;

public abstract class Cuenta {
    private String cliente;

    public Cuenta(String cliente){
        this.cliente = cliente;
    }

    public abstract void extraerEfectivo(Double monto);
}
