public class Circulo implements Figura{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        System.out.println("El área es de: " + Math.pow(radio,2) * Math.PI);
        return Math.pow(radio,2) * Math.PI;
    }
}
