import java.util.ArrayList;
import java.util.Date;

public class BusquedaHotelService {
    private ArrayList<Hotel> hoteles;

    public BusquedaHotelService(ArrayList<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public void addHotel(Hotel hotel) {
        this.hoteles.add(hotel);
    }

    public ArrayList<Hotel> buscarHotel(Date fechaEntrada, Date fechaSalida, String ciudad){
        ArrayList<Hotel> hotelesEncontrados = new ArrayList<>();
        for (Hotel h : hoteles) {
            if(h.getFechaEntrada().equals(fechaEntrada) && h.getFechaSalida().equals(fechaSalida) &&
            h.getCiudad().equals(ciudad)){
                hotelesEncontrados.add(h);
            }
        }
        System.out.println("Se encontraron: " + hotelesEncontrados.size() + " hoteles");
        return hotelesEncontrados;
    }
}
