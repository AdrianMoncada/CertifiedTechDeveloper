public class Main {
    public static void main(String[] args) {
        ProductoFactory productoFactory = ProductoFactory.getInstance();

        Almacen almacen = new Almacen();

        almacen.agregarProducto(productoFactory.generarProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(productoFactory.generarProducto("CAJA10X10"));
        almacen.agregarProducto(productoFactory.generarProducto("PELOTATENIS"));

        System.out.println(almacen.calcularEspacioNecesario());
    }
}