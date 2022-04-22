public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10.0);
        Circulo circulo2 = new Circulo(10.0);
        Rectangulo rectangulo1 = new Rectangulo(10.0,15.0);
        Rectangulo rectangulo2 = new Rectangulo(10.0,20.0);
        Rectangulo rectangulo3 = new Rectangulo(15.0,5.0);
        Triangulo triangulo1 = new Triangulo(10.0,20.0);

        Locomotora locomotora1 = new Locomotora();

        locomotora1.addFigura(circulo1);
        locomotora1.addFigura(circulo2);
        locomotora1.addFigura(rectangulo1);
        locomotora1.addFigura(rectangulo2);
        locomotora1.addFigura(rectangulo3);
        locomotora1.addFigura(triangulo1);

        locomotora1.calcularArea();

    }
}