import java.util.List;
import java.util.ArrayList;

public class Pizzeria {

    private List<Pizza> listaPizzas;

    public Pizzeria() {
        listaPizzas = new ArrayList<>();
    }

    public void agregarPizza(String codigo) {
        try {
            listaPizzas.add(PizzaFactory.getInstance().generarPizza(codigo));
        } catch (PizzaFactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarPizzas() {
        for (Pizza pizza : listaPizzas) {
            System.out.println(pizza);
        }
    }
}
