import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Usuario adrianMoncada = new Usuario("1234567890","abc123");
        Usuario juanaMolina = new Usuario("12309827890","zxc123");

        ArrayList<Usuario> baseDatos = new ArrayList<>();
        baseDatos.add(adrianMoncada);
        baseDatos.add(juanaMolina);

        ICajeroService cajeroService = new CajeroService(new AutenticationService(baseDatos), new CuentaService(),new CajaService());
        cajeroService.retirarDinero("12309827890","zxc123",1000);
        cajeroService.retirarDinero("12309827890","555666",1000);
    }
}