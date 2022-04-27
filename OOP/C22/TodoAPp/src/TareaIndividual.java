public class TareaIndividual implements Realizable{
    private String nombre;
    private String descripcion;
    private Boolean completada;

    public TareaIndividual(String nombre, String descripcion, Boolean completada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = completada;
    }


    @Override
    public void InformarPorcentajeCompletitud() {
        System.out.println("Pendiente");
    }

    public Boolean getCompletada() {
        System.out.println("completada:");
        return completada;
    }
}
