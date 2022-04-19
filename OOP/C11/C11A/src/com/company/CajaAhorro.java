package com.company;

public class CajaAhorro extends Cuenta {
    private Double saldo;
    private Double tasaInteres;
    private Double interesesAcumulados;

    public CajaAhorro(String cliente) {
        super(cliente);
        this.saldo = 0.0;
        this.tasaInteres = 2.615;
        this.interesesAcumulados = 0.0;
    }

    public void depositarEfectivo(Double monto){
        if(monto < 0){
            System.out.println("Error: No puede depositar monto negativo");
        } else {
            this.saldo += monto;
        }
    }

    public void cobrarInteres() {
        this.saldo += interesesAcumulados;
    }

    @Override
    public void extraerEfectivo(Double monto) {
        if(monto < 0){
            System.out.println("Error: No puede extraer monto negativo");
        } else if(saldo >= monto){
            saldo -= monto;
        } else {
            System.out.println("Su saldo actual es de: " + saldo + ". Ingerese un monto menor");
        }

    }

    public Double getSaldo() {
        System.out.println(saldo);
        return saldo;
    }

    public Double getTasaInteres() {
        System.out.println(tasaInteres);
        return tasaInteres;
    }

    public void setInteresesAcumulados(Double interesesAcumulados) {
        this.interesesAcumulados = interesesAcumulados;
    }
}
