public class PizzaFactory {

    public static final String MUZZARELLA_CHICA = "Muzzarella Chica";
    public static final String ESPECIAL_CHICA = "Especial Chica";
    public static final String ANANA_CHICA = "Anana Chica";
    public static final String COMBINADA_LOCA = "Combinada Loca";
    private static PizzaFactory instance;

    private PizzaFactory() {

    }

    public static PizzaFactory getInstance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza generarPizza(String codigo) throws PizzaFactoryException{
        switch (codigo) {
            case MUZZARELLA_CHICA:
                return new PizzaSimple("muzzarella", "tomate, queso muzzarella, olivas verdes", 700.0, false);
            case ESPECIAL_CHICA:
                return new PizzaSimple("especial", "tomate, queso dambo, jamon ahumado, huevo", 850.0, false);
            case ANANA_CHICA:
                return new PizzaSimple("anana", "anana, tomate, queso random, azucar morena", 950.0, false);
            case COMBINADA_LOCA:
                PizzaCombinada loca = new PizzaCombinada("loca", "mitad especial, mitad anana");
                loca.agregarPizza(generarPizza(ESPECIAL_CHICA));
                loca.agregarPizza(generarPizza(ANANA_CHICA));
                return loca;
        }
        throw new PizzaFactoryException("Ingrese un codigo valido.");
    }
}
