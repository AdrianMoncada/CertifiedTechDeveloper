public class Main {
    public static void main(String[] args) {
        AnalistaCalidad pedro = new AnalistaCalidad();
        pedro.ValidarCalidadDelProducto(new Producto("Notebook Lenovo E32K", 1300,1250, "sano"));
        pedro.ValidarCalidadDelProducto(new Producto("Notebook Lenovo E32K", 1300,1250, "dañado"));
        pedro.ValidarCalidadDelProducto(new Producto("Notebook Lenovo E32K", 300,1250, "sano"));
    }
}