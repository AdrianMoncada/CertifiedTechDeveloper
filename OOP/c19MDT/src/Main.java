public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ProductoFactory productoFactory = ProductoFactory.getInstance();

        Almacen almacen = new Almacen();

        almacen.agregarProducto(productoFactory.generarProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(productoFactory.generarProducto("PELOTAFULTBOL"));
        almacen.agregarProducto(productoFactory.generarProducto("PELOTATENIS"));

        System.out.println(almacen.calcularEspacioNecesario());
    }
}