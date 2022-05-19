import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona adrian = new Persona("Adrián","Moncada","45678910", new Date("05/19/2022"));
        Persona adrianMoncada = new Persona("Adrián","Moncada","45678910", new Date("05/19/2022"));
        Persona marcos = new Persona("Marcos","XYZ","12345678910", new Date("02/19/2022"));

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(adrianMoncada);

        IVacunacion centroVacunacion = new ProxyVacunacion(listaPersonas);
        centroVacunacion.vacunar(adrian);
        centroVacunacion.vacunar(marcos);


    }
}