public class PizzaSimple extends Pizza {

    private Double precioBase;
    private Boolean estaGrande;

    public PizzaSimple(String nombre, String descripcion, Double precioBase, Boolean estaGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.estaGrande = estaGrande;
    }

    @Override
    public Double calcularPrecio() {
        if (estaGrande) {
            return precioBase * 2.0;
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "PizzaSimple: " + super.getNombre() + ", con precio igual a " + calcularPrecio();
    }
}
