public class Test {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarPizza(PizzaFactory.MUZARELLA_CHICA);
        pizzeria.agregarPizza(PizzaFactory.ESPECIAL_CHICA);
        pizzeria.agregarPizza(PizzaFactory.ANANA_CHICA);
        pizzeria.agregarPizza(PizzaFactory.COMBINADA_LOCA);

        pizzeria.mostrarPizzas();

    }
}