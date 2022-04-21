public interface Estado {
    void siguientePaso();

    void valorPresupuesto(Double costo) throws EstadoException;

    void agregarRepuesto(Double costoRepuesto) throws EstadoException;

    void cambiarDireccion(String direccion) throws EstadoException;
}
