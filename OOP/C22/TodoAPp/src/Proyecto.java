import java.util.ArrayList;
import java.util.List;

public class Proyecto implements Realizable{
    private String nombre;
    private String descripcion;
    private Boolean completada;
    private List<Realizable> tareas;

    public Proyecto(String nombre, String descripcion, Boolean completada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = completada;
        this.tareas = new ArrayList<>();
    }


    @Override
    public void InformarPorcentajeCompletitud() {
        Double tareasTotales = 0.0;
        Double tareasCompletadas = 0.0;
        for (Realizable tarea : tareas) {
            tareasTotales++;
            tarea.getCompletada();
/*            if(tarea.getCompletada()){
                System.out.println("+1 completada");
                tareasCompletadas++;
            }*/

        }
        Double porcentajeCompletadas = (tareasCompletadas * 100.0) / tareasTotales;
        System.out.println(" El porcentaje de tareas completadas es de: " + porcentajeCompletadas);
    }

    @Override
    public Boolean getCompletada() {
        return completada;
    }

    public void addTarea(Realizable realizable){
        this.tareas.add(realizable);
    }

    public void removeTarea(Realizable realizable){
        this.tareas.remove(realizable);
    }
}
