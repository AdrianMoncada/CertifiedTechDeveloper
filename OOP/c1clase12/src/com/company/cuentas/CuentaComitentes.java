package com.company.cuentas;

import com.company.Cliente;

public class CuentaComitentes extends Cuenta {
    private String cnv;

    public CuentaComitentes(Cliente titular, Double saldo, String cnv) {
        super(titular, saldo);
        this.cnv = cnv;
    }

    public void depositar(Double monto) {
        Double monto2 = monto * 0.99;
        super.depositar(monto2);
    }

    @Override
    public Boolean puedeExtraer(Double monto) {
        System.out.println(monto);
        System.out.println(getSaldo()*0.5);
        return getSaldo()*0.5 > monto;
    }

    public void extraer(Double monto, String cnv) {
        super.extraer(monto);
    }
}
