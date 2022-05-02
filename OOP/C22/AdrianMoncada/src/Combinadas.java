import java.util.ArrayList;
import java.util.List;

public class Combinadas extends Pizza{
    private List<Pizza> pizzas;

    public Combinadas(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        this.pizzas.add(pizza);
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
        return "Pizza Combinada: " + super.getNombre() + ", precio: " + calcularPrecio();
    }
}
