public class ReparacionFactory {
    private static ReparacionFactory instance;

    private ReparacionFactory(){
    }

    public static ReparacionFactory getInstance(){
        if(instance == null){
            instance = new ReparacionFactory();
        }
        return instance;
    }

    public Reparacion crearReparacion(String nombreProducto){
        return new Reparacion("nombreProducto");
    }
}
