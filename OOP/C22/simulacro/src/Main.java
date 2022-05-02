public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

//        PizzaSimple ps1 = new PizzaSimple("muzzarella", "tomate, queso muzzarella, olivas verdes", 700.0, false);
//        PizzaSimple ps2 = new PizzaSimple("especial", "tomate, queso dambo, jamon ahumado, huevo", 850.0, false);
//        PizzaSimple ps3 = new PizzaSimple("anana", "anana, tomate, queso random, azucar morena", 950.0, false);
//        PizzaCombinada pc1 = new PizzaCombinada("loca", "mitad especial, mitad anana");
//        pc1.agregarPizza(ps2);
//        pc1.agregarPizza(ps3);

//        PizzaFactory fabrica = PizzaFactory.getInstance();
//
//
//        pizzeria.agregarPizza(fabrica.generarPizza(PizzaFactory.MUZZARELLA_CHICA));
//        pizzeria.agregarPizza(fabrica.generarPizza(PizzaFactory.ESPECIAL_CHICA));
//        pizzeria.agregarPizza(fabrica.generarPizza(PizzaFactory.ANANA_CHICA));
//        pizzeria.agregarPizza(fabrica.generarPizza(PizzaFactory.COMBINADA_LOCA));
//        pizzeria.agregarPizza(ps2);
//        pizzeria.agregarPizza(ps3);
//        pizzeria.agregarPizza(pc1);

        pizzeria.agregarPizza(PizzaFactory.MUZZARELLA_CHICA);
        pizzeria.agregarPizza(PizzaFactory.ESPECIAL_CHICA);
        pizzeria.agregarPizza(PizzaFactory.ANANA_CHICA);
        pizzeria.agregarPizza(PizzaFactory.COMBINADA_LOCA);

        pizzeria.mostrarPizzas();
    }
}