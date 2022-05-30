public class Usuario {
    private String nombre;
    private Long id;
    private String email;
    private double sueldo;

    public Usuario(String nombre, String email, double sueldo) {
        this.nombre = nombre;
        this.email = email;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double subirSueldo(double precio){
        this.sueldo = this.sueldo + precio;
        return this.sueldo;
    }
}
