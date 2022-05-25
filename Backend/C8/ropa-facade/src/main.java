public class main {

    public static void main(String[] args) {
        RopaFactory almacen = new RopaFactory();
        Ropa pantalon = almacen.getRopa("s", "pantalon", true, true);
        Ropa pantalon2 = almacen.getRopa("m", "pantalon", true, true);

        Ropa pantalon3 = almacen.getRopa("s", "pantalon", true, true);
        Ropa pantalon4 = almacen.getRopa("m", "pantalon", true, true);
        Ropa pantalon5 = almacen.getRopa("l", "pantalon", true, true);
        Ropa pantalon6 = almacen.getRopa("l", "pantalon", true, false);
        Ropa pantalon7 = almacen.getRopa("xs", "pantalon", true, false);

        almacen.getContador();

        


    }
}
