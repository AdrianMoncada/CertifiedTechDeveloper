public class PizzaFactory {
    public static final String MUZARELLA_CHICA = "MUZARELLA_CHICA";
    public static final String ESPECIAL_CHICA = "ESPECIAL_CHICA";
    public static final String ANANA_CHICA = "ANANA_CHICA";
    public static final String COMBINADA_LOCA = "COMBINADA_LOCA";
    private static PizzaFactory instance;

    private PizzaFactory() {
    }

    public static PizzaFactory getPizzaFactory(){
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza generarPizza(String codigo) throws PizzaFactoryException{
        switch (codigo) {
            case MUZARELLA_CHICA:
                return new Simples("Muzarea","Pizza Muzarella Chica", 700.0,false);
            case ESPECIAL_CHICA:
                return new Simples("Especial","Pizza Especial Chica", 850.0, false);
            case ANANA_CHICA:
                return new Simples("Ananá","Pizza Ananá Chica",950.0,false);
            case COMBINADA_LOCA:
                Combinadas loca = new Combinadas("Loca","Pizza Loca");
                loca.agregarPizza(generarPizza(ESPECIAL_CHICA));
                loca.agregarPizza(generarPizza(ANANA_CHICA));
                return loca;
        }
        throw new PizzaFactoryException("Codigo inválido");
    }


}
