package com.company;

import com.company.cuentas.Cuenta;
import com.company.cuentas.CuentaCajaDeAhorro;
import com.company.cuentas.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente = new Cliente(1,"Simpson","1234","12345");
        CuentaCorriente cuenta = new CuentaCorriente(cliente,1000.0,1000.0);
        CuentaCajaDeAhorro cuenta1 = new CuentaCajaDeAhorro(cliente,1500.0,0.1);
//        cuenta.depositar(100.0);
//        cuenta.extraer(1200.0);
//        cuenta.gravarImpuesto(0.5);
//
//
//        Cheque cheque = new Cheque("Banco DH",3000.0);
//
//        cuenta.depositar(cheque);

        System.out.println(cuenta.compareTo(cuenta1));




    }
}
