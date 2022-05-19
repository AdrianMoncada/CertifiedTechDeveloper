public class Usuario {
    private String tipoUsuario;
    private String id;

    public Usuario(String tipoUsuario, String id) {
        this.tipoUsuario = tipoUsuario;
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getId() {
        return id;
    }
}
