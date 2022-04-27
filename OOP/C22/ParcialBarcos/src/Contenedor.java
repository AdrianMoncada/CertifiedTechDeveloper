import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{
    private List<Carga> listaCargas;
    private Double pesoContenedor;

    public Contenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        this.listaCargas = new ArrayList<>();
    }


    @Override
    public Double calcularPeso() {
        Double total = 0.0;
        for (Carga cargas : listaCargas) {
        total += cargas.calcularPeso();
        }
        return total + pesoContenedor;
    }

    public void addCarga(Carga carga){
        this.listaCargas.add(carga);
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + " peso: " + this.calcularPeso();
    }
}
