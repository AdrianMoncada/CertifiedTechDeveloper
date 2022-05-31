import com.company.dao.AvionDAOH2;
import com.company.entidades.Avion;
import com.company.servicios.AvionService;

public class Main {
    public static void main(String[] args) {
    Avion avion = new Avion();

    avion.setId(1L);
    avion.setModelo("random");
    avion.setMatricula("123");
    avion.setMarca("boing");
    avion.setFechaEntradaServicio("14/10/95");

        AvionService avionService = new AvionService();
        avionService.setAvionIDao(new AvionDAOH2());

    avionService.guardar(avion);
    }
}