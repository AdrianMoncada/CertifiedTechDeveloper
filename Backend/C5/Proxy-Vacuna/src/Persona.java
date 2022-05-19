import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaVacunacion;

    public Persona(String nombre, String apellido, String dni, Date fechaVacunacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaVacunacion = fechaVacunacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Date getFechaVacunacion() {
        return fechaVacunacion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaVacunacion=" + fechaVacunacion +
                '}';
    }
}
