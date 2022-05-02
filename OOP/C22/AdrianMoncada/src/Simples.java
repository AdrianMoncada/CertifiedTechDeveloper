public class Simples extends Pizza{
    private Double precioBase;
    private Boolean esGrande;

    public Simples(String nombre, String descripcion, Double precioBase, Boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    @Override
    public Double calcularPrecio() {
        if(esGrande){
            return precioBase * 2.0;
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "Pizza Simple: " + super.getNombre() + ", precio: " + calcularPrecio();
    }
}
