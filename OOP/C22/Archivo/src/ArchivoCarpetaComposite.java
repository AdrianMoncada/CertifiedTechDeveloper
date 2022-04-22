import java.util.ArrayList;
import java.util.List;

public class ArchivoCarpetaComposite implements Archivo{
    private String nombre;
    private List<Archivo> childsArchivos;

    public ArchivoCarpetaComposite(String nombre) {
        this.nombre = nombre;
        this.childsArchivos = new ArrayList<>();
    }


    @Override
    public void getNombre() {
        childsArchivos.forEach(Archivo ::getNombre);
    }

    public void addArchivo(Archivo archivo){
        childsArchivos.add(archivo);
    }

    public void removeArchivo(Archivo archivo){
        childsArchivos.remove(archivo);
    }
}
