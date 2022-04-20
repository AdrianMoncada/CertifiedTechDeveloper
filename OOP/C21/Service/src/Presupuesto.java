public class Presupuesto implements Estado{

    @Override
    public Estado siguientePaso() {
    return new EnReparacion();
    }

    @Override
    public void valorPresupuesto() {
    Reparacion.getCosto();
    }

    @Override
    public void sumaRepuesto() {

    }

    @Override
    public void cambiarDireccion() {

    }
}
