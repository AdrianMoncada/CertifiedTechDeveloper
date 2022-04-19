package com.company;

public class Cuenta {
    private String titular;
    private Double saldo;
    public Cuenta(String titular, Double saldo) throws CuentaException {
        this.titular=titular;
        if (saldo<0)
            throw new CuentaException("No se puede crear una cuenta con saldo negativo");
        this.saldo=saldo;
    }

    public void extraer(Double importe) throws CuentaException {
        if (importe > saldo)
            throw new CuentaException("No hay saldo sufieciente para esta extracción");
        saldo=saldo-importe;
    }

    public void depositar(Double importe) {
        saldo+=importe;
    }
}
