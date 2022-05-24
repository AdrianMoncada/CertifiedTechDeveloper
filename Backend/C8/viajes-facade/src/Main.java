import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo(new Date("05/19/2022"), new Date("06/19/2022"), "Argentina", "Francia");
        Vuelo vuelo2 = new Vuelo(new Date("05/19/2022"), new Date("06/19/2022"), "Argentina", "Alemania");
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        Hotel hotel1 = new Hotel(new Date("05/19/2022"), new Date("06/19/2022"), "Alemania");
        Hotel hotel2 = new Hotel(new Date("05/19/2022"), new Date("06/19/2022"), "Francia");
        ArrayList<Hotel> hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);

        BusquedaVueloService vueloService = new BusquedaVueloService(vuelos);
        BusquedaHotelService hotelService = new BusquedaHotelService(hoteles);
        BusquedaVueloHotel busqueda = new BusquedaVueloHotel(hotelService,vueloService);

        busqueda.buscarVueloYHotel("Argentina", new Date("05/19/2022"), new Date("06/19/2022"), "Alemania");

    }
}