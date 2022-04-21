public class Main {
    public static void main(String[] args) throws EstadoException, ReparacionFactoryException {
        ReparacionFactory reparacionFactory = ReparacionFactory.getInstance();
        Reparacion batidora = reparacionFactory.crearReparacion(ReparacionFactory.BATIDORA);
        batidora.valorPresupuesto(200.0);
        batidora.siguientePaso();
        batidora.agregarRepuesto(300.0);
        batidora.siguientePaso();
        batidora.cambiarDireccion("Elm Street 1984");
        batidora.siguientePaso();
    }
}