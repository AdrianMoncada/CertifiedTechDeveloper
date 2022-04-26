import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo implements Vendible{
    private List<Vendible> ofertasAcademicas;
    private String nombre;
    private String descripcion;
    private Double bonificacion;

    private Double precioTotal;

    public ProgramaIntensivo(String nombre, String descripcion, Double bonificacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bonificacion = bonificacion;
        this.ofertasAcademicas = new ArrayList<>();
        this.precioTotal = 0.0;
    }

    public void addVendible(Vendible vendible){
    ofertasAcademicas.add(vendible);
    }

    public void removeVendible(Vendible vendible){
        ofertasAcademicas.remove(vendible);
    }

    @Override
    public Double calcularPrecio() {
        Double total = 0.0;
        for (Vendible ofertasAcademica : ofertasAcademicas) {
            total += ofertasAcademica.calcularPrecio();
        }
        total = total - (total * bonificacion / 100);
        return this.precioTotal = total;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }
    @Override
    public void mostrarInformacion(){
        calcularPrecio();
        System.out.println(this.nombre + " $" + this.precioTotal);
    }
}
