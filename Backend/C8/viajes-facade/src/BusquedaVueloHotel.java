import java.util.Date;

public class BusquedaVueloHotel {
    private BusquedaHotelService busquedaHotel;
    private BusquedaVueloService busquedaVuelo;

    public BusquedaVueloHotel(BusquedaHotelService busquedaHotel, BusquedaVueloService busquedaVuelo) {
        this.busquedaHotel = busquedaHotel;
        this.busquedaVuelo = busquedaVuelo;
    }

    public void buscarVueloYHotel(String ciudadOrigen, Date desde, Date hasta, String ciudadDestino){
        System.out.println(busquedaHotel.buscarHotel(desde,hasta,ciudadDestino));
        System.out.println(busquedaVuelo.buscarVuelo(desde,hasta,ciudadOrigen,ciudadDestino));
    }
}
