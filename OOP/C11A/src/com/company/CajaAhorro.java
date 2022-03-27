package com.company;

public class CajaAhorro extends Cuenta {
    public CajaAhorro(String cliente) {
        super(cliente);
    }

    @Override
    public void extraerEfectivo() {
        System.out.println("El cliente extrae dinero");
    }
}
