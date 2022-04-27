public class CargaFactory {
    public static final String LCD_32 = "LCD_32";
    public static final String MEDS = "MEDS";
    public static final String CONTENEDOR_1108 = "CONTENEDOR1108";
    private static CargaFactory instance;

    private CargaFactory() {

    }

    public static CargaFactory getInstance(){
        if(instance == null){
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga generarCarga(String codigo) throws CargaFactoryException{
    switch(codigo){
        case LCD_32:
            return new Simple("TV 32’ LCD","Dispositivo para ver cosas, y ya.",3.0,false);
        case MEDS:
            return new Simple("Medicamentos amoxicilina","Cargamento de pastillas",2.0,true);
        case CONTENEDOR_1108:
            Contenedor contenedorRandom = new Contenedor("contenedor1108","contiene cosas.",100.0);
            contenedorRandom.addCarga(generarCarga(LCD_32));
            contenedorRandom.addCarga(generarCarga(MEDS));
            return contenedorRandom;
    }
    throw new CargaFactoryException("DETÉNGASE!ingrese código correcto");
    }
}
