public class ReparacionFactory {

    public static final String BATIDORA = "Batidora";
    private static ReparacionFactory instance;

    private ReparacionFactory(){
    }

    public static ReparacionFactory getInstance(){
        if(instance == null){
            instance = new ReparacionFactory();
        }
        return instance;
    }

    public Reparacion crearReparacion(String codigo) throws ReparacionFactoryException{
        switch (codigo){
            case BATIDORA:
                return new Reparacion("Licuadora");
        }
        throw new ReparacionFactoryException(codigo + " no es una reparacion válida");
    }
}
