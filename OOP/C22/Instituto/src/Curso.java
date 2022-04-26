public class Curso implements Vendible{
    private String nombre;
    private String descripcion;
    private Double cargaHoraria;
    private Double duracion;

    private Double precioHora;

    private Double precioTotal;

    public Curso(String nombre, String descripcion, Double cargaHoraria, Double duracion, Double precioHora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cargaHoraria = cargaHoraria;
        this.duracion = duracion;
        this.precioHora = precioHora;
        this.precioTotal = calcularPrecio();
    }


    @Override
    public Double calcularPrecio() {
        return cargaHoraria * precioHora * duracion;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println(this.nombre + " $" + this.precioTotal);
    }
}
