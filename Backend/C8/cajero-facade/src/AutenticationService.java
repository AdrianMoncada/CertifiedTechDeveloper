import java.util.ArrayList;

public class AutenticationService {
    private ArrayList<Usuario> usuarios;

    public AutenticationService(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Boolean validarUsuarioYContrasena(String dni, String password){
        //logica
        for (Usuario u : usuarios) {
            if(u.getDni().equals(dni) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
