package com.company.cuentas;

import com.company.Cliente;

public abstract class Cuenta implements Comparable {

    private Cliente titular;
    protected Double saldo;

    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double monto){
        if(monto >  0){
            System.out.println("se deposito " + monto);
            saldo += monto;
            informarSaldo();
        }
    }

    public void extraer(Double monto){
        if(puedeExrtraer(monto)){
            saldo -= monto;
        }
    }

    public Boolean puedeExrtraer(Double monto){
        return saldo > monto;
    }



    public void informarSaldo(){
        System.out.println("tu saldo es de " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Object object) {

        Cuenta otraCuenta = (Cuenta) object;

        if(this.saldo > otraCuenta.saldo ){
           return 1;
        }
        if (this.saldo < otraCuenta.saldo){
            return -1;
        }
        return 0;
    }
}
