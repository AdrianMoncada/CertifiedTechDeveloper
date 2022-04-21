public class EstadoFinalizado implements Estado{

    private Reparacion v;

    public EstadoFinalizado(Reparacion v){
        this.v = v;
    }


    @Override
    public void siguientePaso() {
        System.out.println("Error, no quedan pasos siguientes");
    }

    @Override
    public void valorPresupuesto(Double costo) throws EstadoException {
        throw new EstadoException("Error, no puede presupuestar artículo en estado de finalizado");
    }

    @Override
    public void agregarRepuesto(Double costoRepuesto) throws EstadoException {
        throw new EstadoException("Error, no puede agregar repuesto en estado de finalizado");
    }

    @Override
    public void cambiarDireccion(String direccion) throws EstadoException {
        throw new EstadoException("Error, no puede cambiar dirección en estado de finalizado");
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
