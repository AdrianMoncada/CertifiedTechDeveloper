public class Reparacion {
    private String nombre;
    private Double costo;
    private String direccionEntrega;

    private Estado estadoActual;

    public Reparacion(String nombre, String direccionEntrega) {
        this.nombre = nombre;
        this.costo = 0.0;
        this.direccionEntrega = direccionEntrega;
        estadoActual = new EstadoPresupuesto;
    }

    public void valorPresupuesto(Double costo){
        this.costo = costo;
    }

    public Double getCosto() {
        return costo;
    }

    public void sumaRespuesto(Double repuesto){}; /*{
        this.costo += repuesto;
    }*/

    public void cambiarDireccion(String direccion){}; /*{
        this.direccionEntrega = direccion;
    }*/

    public void siguientePaso(){};/*{
        this.estadoActual = new EstadoEnReparacion();
    }*/


}
