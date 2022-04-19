public class Pelota extends Producto {
    private Double radio;

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }


    @Override
    public Double calcularEspacio() {
        /*pendiente*/
        return (4/3) * Math.PI * (radio*radio*radio);
    }
}
