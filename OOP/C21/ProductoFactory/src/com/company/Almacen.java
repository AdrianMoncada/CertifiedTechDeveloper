package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen  {

    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String codigoProducto) {
        try{
            productos.add(ProductoFactory.getInstance().crearProducto(codigoProducto));
        }catch (ProductoFactoryException e){
            System.out.println("algo fallo");
        }
    }

    public Double calcularEspacioNecesario(){
        Double espacioNecesario = 0.0;
        for (Producto producto : productos) {
            espacioNecesario += producto.calcularEspacio();
        }

        return espacioNecesario;
    }
}
