package com.company.cuentas;

import com.company.Cheque;
import com.company.Cliente;
import com.company.ImpuestoGravable;

import javax.swing.*;
import java.io.Serializable;


public class CuentaCorriente extends Cuenta implements ImpuestoGravable {

    private Double montoAutorizado;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular, saldo);
        this.montoAutorizado = montoAutorizado;
    }



    public void depositar(Cheque cheque) {
        System.out.println("estoy depositando un cheque");
        super.depositar(cheque.getValor());
    }


    @Override
    public Boolean puedeExrtraer(Double monto) {
        return getSaldo() + montoAutorizado > monto;
    }

    @Override
    public Double gravarImpuesto(Double porcentaje) {
        Double montoADescontar = porcentaje*saldo;
        saldo -= montoADescontar;
        informarSaldo();
        return montoADescontar;
    }
}
