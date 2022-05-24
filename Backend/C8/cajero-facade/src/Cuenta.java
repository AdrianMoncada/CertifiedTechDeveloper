public class Cuenta {
    private String dni;
    private Integer saldoActual;
    //Modificar Integer a Boolean luego


    public Cuenta(String dni, Integer saldoActual) {
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public void setSaldoActual(Integer saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getDni() {
        return dni;
    }

    public Integer getSaldoActual() {
        return saldoActual;
    }
}
