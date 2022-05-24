import java.util.ArrayList;
import java.util.Date;

public class BusquedaVueloService {
    private ArrayList<Vuelo> vuelos;


    public BusquedaVueloService(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void addVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public ArrayList<Vuelo> buscarVuelo(Date fechaSalida, Date fechaRegreso, String origen, String destino){
        ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo v : vuelos) {
            if(v.getFechaSalida().equals(fechaSalida) && v.getFechaRegreso().equals(fechaRegreso) &&
                    v.getOrigen().equals(origen) && v.getDestino().equals(destino)){
                vuelosEncontrados.add(v);
            }
        }
        System.out.println("Se encontraron: " + vuelosEncontrados.size() + " de vuelos");
        return vuelosEncontrados;
    }
}
