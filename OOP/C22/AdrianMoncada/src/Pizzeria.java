import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> listaPizzas;

    public Pizzeria() {
        this.listaPizzas = new ArrayList<>();
    }

    public void agregarPizza(String codigo){
        try{
        listaPizzas.add(PizzaFactory.getPizzaFactory().generarPizza(codigo));
        } catch (PizzaFactoryException e){
            System.out.println(e.getMessage());
        }
    }

    public void mostrarPizzas(){
        for (Pizza pizza : listaPizzas) {
            System.out.println(pizza);
        }
    }


}
