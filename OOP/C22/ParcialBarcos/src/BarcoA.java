import java.util.List;
import java.util.ArrayList;


public class BarcoA {
    private List<Carga> cargas;

    public BarcoA() {
        this.cargas = new ArrayList<>();
    }

    public void addCarga(String codigo){
    try {
        cargas.add(CargaFactory.getInstance().generarCarga(codigo));
    }
    catch(CargaFactoryException e){
        System.out.println(e.getMessage());
    }
    }

    public void mostrarCargas(){
        for (Carga carga : cargas) {
            System.out.println(carga);
        }
    }
}
