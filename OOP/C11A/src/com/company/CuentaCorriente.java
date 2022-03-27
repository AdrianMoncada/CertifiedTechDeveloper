package com.company;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(String cliente) {
        super(cliente);
    }

    @Override
    public void extraerEfectivo() {
        System.out.println("El cliente puede extraer dinero y utilizar su giro en descubierto en caso de que no tenga saldo suficiente");
    }
}
