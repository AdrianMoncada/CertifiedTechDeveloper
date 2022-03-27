package com.company;

public class CuentaCorriente extends Cuenta{
    private Double saldo;
    private Double montoGiro;

    public CuentaCorriente(String cliente, Double saldo, Double montoGiro) {
        super(cliente);
        this.saldo = saldo;
        this.montoGiro = montoGiro;
    }

    public void depositarEfectivo(Double monto){
        if(monto < 0){
            System.out.println("Error: No puede extraer monto negativo");
        } else {
            this.saldo += monto;
        }
    }

    @Override
    public void extraerEfectivo(Double monto) {
        if(monto < 0){
            System.out.println("Error: No puede extraer monto negativo ");
        }else if(saldo + montoGiro < monto){
            System.out.println("No tienes saldo disponible. Incluso teniendo en cuenta tu monto autorizado para girar en descubierto");
        }
        else if(saldo >= monto){
            saldo = saldo - monto;
            System.out.println("retiraste: " + monto + " de tu saldo.");
        } else {
            // En caso de no cumplirse las condiciones anteriores, significa que podrá utilizarse el giro.
            // Se utiliza la totalidad del saldo, y el restante se almacena como diferencia
            // En caso de que la diferencia sea un número negativo, se convierte en positivo para luego restarse al montoGiro
            Double diferenciaGiro = saldo - monto;
            if (diferenciaGiro < 0){
                diferenciaGiro = -diferenciaGiro;
            }
            saldo = saldo - saldo;
            montoGiro = montoGiro - diferenciaGiro;
            System.out.println("Utilizaste el total de tu saldo.");
            System.out.println("Además, utilizaste: " + diferenciaGiro + " de tu monto autorizado para girar en descubierto");
        }

    }

    public Double getSaldo() {
        System.out.println("El saldo es de: " + saldo);
        return saldo;
    }

    public Double getMontoGiro() {
        System.out.println("El monto del giro disponible es de: " + montoGiro);
        return montoGiro;
    }
}
