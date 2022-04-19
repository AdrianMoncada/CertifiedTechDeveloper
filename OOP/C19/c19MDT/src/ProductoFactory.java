public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory() {
    }

    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto generarProducto(String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new Caja(0.50,10.0,10.0,10.0);
            case "PELOTAFUTBOL":
                return new Pelota(0.50,11.0);
            case "PELOTATENIS":
                return new Pelota(0.1,0.32);
        }
        return null;
    }
}
