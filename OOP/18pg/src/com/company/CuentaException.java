package com.company;

public class CuentaException extends Exception{
    public CuentaException() {
        super();
    }

    public CuentaException(String mensaje) {
        super(mensaje);
    }

    public String toString(){
        return "Se produjo el siguiente Excepción " + this.getClass().getName() +"\n" +
                " Mensaje: " + this.getMessage() + "\n" ;
    }
}
