public class EstadoEnPresupuesto implements Estado{
    private Reparacion v;

    public EstadoEnPresupuesto(Reparacion v){
        this.v = v;
    }


    @Override
    public void siguientePaso() {
    v.setEstado(new EstadoEnReparacion(v));
    }

    @Override
    public void valorPresupuesto(Double costo) throws EstadoException {
        v.setCosto(costo);
    }

    @Override
    public void agregarRepuesto(Double costoRepuesto) throws EstadoException {
        throw new EstadoException("Error, no puede agregar repuesto en estado de presupuesto");
    }

    @Override
    public void cambiarDireccion(String direccion) throws EstadoException {
        throw new EstadoException("Error, no puede cambiar dirección en estado de presupuesto");
    }

    @Override
    public String toString() {
        return "EnPresupuesto";
    }
}
