public class EstadoEnReparacion implements Estado{
    private Reparacion v;

    public EstadoEnReparacion(Reparacion v){
        this.v = v;
    }


    @Override
    public void siguientePaso() {
        v.setEstado(new EstadoParaEnvio(v));
    }

    @Override
    public void valorPresupuesto(Double costo) throws EstadoException {
        throw new EstadoException("Error, no puede presupuestar artículo en estado de reparacion");
    }

    @Override
    public void agregarRepuesto(Double costoRepuesto) throws EstadoException {
        Double costoFinal = v.getCosto() + costoRepuesto;
        v.setCosto(costoFinal);
    }

    @Override
    public void cambiarDireccion(String direccion) throws EstadoException {
        throw new EstadoException("Error, no puede cambiar dirección en estado de reparacion");
    }

    @Override
    public String toString() {
        return "EnReparación";
    }
}
