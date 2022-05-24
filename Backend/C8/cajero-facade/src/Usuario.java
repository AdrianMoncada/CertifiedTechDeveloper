public class Usuario {
    private String dni;
    private String password;
    private Cuenta cuenta;

    public Usuario(String dni, String password) {
        this.dni = dni;
        this.password = password;
        this.cuenta = new Cuenta(dni,0);
    }

    public String getDni() {
        return dni;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public String getPassword() {
        return password;
    }
}
