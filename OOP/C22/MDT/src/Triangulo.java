public class Triangulo implements Figura{
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public Double calcularArea() {
        System.out.println("El área es de: " + base*altura / 2);
        return base*altura / 2;
    }
}
