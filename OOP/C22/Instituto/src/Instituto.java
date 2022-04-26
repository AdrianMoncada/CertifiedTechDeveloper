import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<Vendible> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void addOfertaAcademica(Vendible vendible){
        ofertasAcademicas.add(vendible);
    }

    public void generarInforme(){
        for (Vendible ofertasAcademica : ofertasAcademicas) {
        ofertasAcademica.mostrarInformacion();
        }
    }
}
