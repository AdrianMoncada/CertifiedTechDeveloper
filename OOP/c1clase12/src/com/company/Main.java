package com.company;

import com.company.cuentas.Cuenta;
import com.company.cuentas.CuentaCajaDeAhorro;
import com.company.cuentas.CuentaComitentes;
import com.company.cuentas.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente = new Cliente(1,"Simpson","1234","12345");
        CuentaComitentes cuenta = new CuentaComitentes(cliente,1000.0,"4562651");

        cuenta.depositar(1000.0);
        cuenta.extraer(600.0);
        cuenta.extraer(1200.0);
        cuenta.extraer(1000.0,"456265111");


        //Cheque cheque = new Cheque("Banco DH",3000.0);

        //cuenta.depositar(cheque);






    }
}
