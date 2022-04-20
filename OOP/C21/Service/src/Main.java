public class Main {
    public static void main(String[] args) {
        ReparacionFactory reparacionFactory = ReparacionFactory.getInstance();



        Reparacion batidora = reparacionFactory.crearReparacion("Batidora");
        batidora.valorPresupuesto(200.0);
        batidora.siguientePaso();
        batidora.sumaRespuesto(100.0);
        batidora.siguientePaso();



    }
}