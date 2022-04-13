import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Double calcularEspacioNecesario(){
        /*pendiente*/
        Double espacioTotal = 0.0;
        for (Producto producto : productos) {
            espacioTotal += producto.calcularEspacio();
        }
        return espacioTotal;
    }
}
