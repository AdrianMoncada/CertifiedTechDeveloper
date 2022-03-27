package com.company;

public class Main {

    public static void main(String[] args) {
	Cuenta cuentaUno = new CajaAhorro("Adrian");
    Cuenta cuentaDos = new CuentaCorriente("Carla");

    cuentaUno.extraerEfectivo();
    cuentaDos.extraerEfectivo();
    }
}
