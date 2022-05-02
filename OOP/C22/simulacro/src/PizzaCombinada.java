import java.util.List;
import java.util.ArrayList;

public class PizzaCombinada extends Pizza {

    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Pizza pizza : pizzas) {
            precioTotal += pizza.calcularPrecio();
        }
        return precioTotal / pizzas.toArray().length;
    }

    @Override
    public String toString() {
        return "PizzaCombinada: " + super.getNombre() + ", con precio igual a " + calcularPrecio();
    }
}
