import java.util.HashMap;
import java.util.Map;

public class RopaFactory {

    private static Map<String, Ropa> ROPAMAP = new HashMap<>();
    private int contador;

    public RopaFactory() {
        contador = 0;
    }

    public int getContador() {
        return contador;
    }

    public Ropa getRopa(String talla, String tipo, Boolean esNuevo, Boolean importada) {
        String clave = "key: " + talla + " : " + tipo + " : " + esNuevo + " : " + importada;
        if (ROPAMAP.containsKey(clave)) {
            System.out.println("Ropa obtenida de hasmap");
            return ROPAMAP.get(clave);
        }
        ROPAMAP.put(clave, new Ropa(talla, tipo, esNuevo, importada));
        System.out.println("Ropa creada");
        contador++;
        return ROPAMAP.get(clave);
    }
}
