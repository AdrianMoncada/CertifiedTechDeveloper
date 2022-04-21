public class Reparacion{
    private String nombre;
    private Double costo;
    private String direccionEntrega;
    private Estado estadoActual;

    public Reparacion(String nombre) {
        this.nombre = nombre;
        costo = null;
        direccionEntrega = null;
        this.setEstado(new EstadoEnPresupuesto(this));
    }



    public void siguientePaso(){
        getEstadoActual().siguientePaso();
        System.out.println(this);
    }

    public void agregarRepuesto(Double costoRepuesto) throws EstadoException{
        try {
            getEstadoActual().agregarRepuesto(costoRepuesto);
        } catch (EstadoException e) {
            System.out.println(e.getMessage());
            /*throw new RuntimeException(e);*/
        }
    }

    public void valorPresupuesto(Double costo) throws EstadoException{
        try {
            getEstadoActual().valorPresupuesto(costo);
        } catch (EstadoException e) {
            System.out.println(e.getMessage());
            /*throw new RuntimeException(e);*/
        }
    }

    public void cambiarDireccion(String direccion) throws EstadoException{
        try {
            getEstadoActual().cambiarDireccion(direccion);
        } catch (EstadoException e) {
            System.out.println(e.getMessage());
            /*throw new RuntimeException(e);*/
        }
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setEstado(Estado estado){
        this.estadoActual = estado;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public Double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", estadoActual=" + estadoActual +
                '}';
    }
}
