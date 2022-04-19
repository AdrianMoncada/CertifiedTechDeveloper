package com.company;

public class Main {

    public static void main(String[] args) {
	CajaAhorro cuentaUno = new CajaAhorro("Adrian");

    System.out.println("CAJA AHORRO:");
    cuentaUno.depositarEfectivo(1000.0);
    cuentaUno.getSaldo();
    cuentaUno.extraerEfectivo(-50.0);
    cuentaUno.getSaldo();

    CuentaCorriente cuentaDos = new CuentaCorriente("Carla", 0.0, 1000.0);

    System.out.println("CUENTA CORRIENTE:");
    cuentaDos.depositarEfectivo(500.0);
    cuentaDos.getSaldo();
    cuentaDos.extraerEfectivo(800.0);
    cuentaDos.getMontoGiro();
    cuentaDos.getSaldo();
    }
}
