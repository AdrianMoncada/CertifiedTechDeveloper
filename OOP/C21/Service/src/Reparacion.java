public abstract class Reparacion {
    private String nombre;
    private Double costo;
    private String direccionEntrega;

    private Estado estadoActual;

    public Reparacion(String nombre) {
        this.nombre = nombre;
        this.costo = null;
        this.direccionEntrega = null;
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

    public abstract void siguientePaso();


}
