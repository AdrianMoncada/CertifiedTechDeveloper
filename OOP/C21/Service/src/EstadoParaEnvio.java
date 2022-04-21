public class EstadoParaEnvio implements Estado{
    private Reparacion v;

    public EstadoParaEnvio(Reparacion v){
        this.v = v;
    }


    @Override
    public void siguientePaso() {
    v.setEstado(new EstadoFinalizado(v));
    }

    @Override
    public void valorPresupuesto(Double costo) throws EstadoException {
        throw new EstadoException("Error, no puede presupuestar artículo en estado de envío");

    }

    @Override
    public void agregarRepuesto(Double costoRepuesto) throws EstadoException {
        throw new EstadoException("Error, no puede agregar repuesto en estado de envio");
    }

    @Override
    public void cambiarDireccion(String direccion) throws EstadoException {
        v.setDireccionEntrega(direccion);
    }

    @Override
    public String toString() {
        return "ParaEnvio";
    }
}
