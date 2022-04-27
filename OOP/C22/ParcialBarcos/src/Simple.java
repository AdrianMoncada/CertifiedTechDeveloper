public class Simple extends Carga{
    private Double pesoCarga;
    private Boolean necesitaRefrigeracion;

    public Simple(String nombre, String descripcion, Double pesoCarga, Boolean necesitaRefrigeracion) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

    @Override
    public Double calcularPeso() {
        if(necesitaRefrigeracion){
            return this.pesoCarga * 1.1;
        }
        return this.pesoCarga;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + " peso: " + this.calcularPeso();
    }
}
