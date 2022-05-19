public class ProxyDescarga implements Descargable {
    private ServiceDescarga serviceDescarga;

    public ProxyDescarga(ServiceDescarga serviceDescarga) {
        this.serviceDescarga = serviceDescarga;
    }

    @Override
    public void descarga(Usuario usuario) {
    if(usuario.getTipoUsuario().equals("Premium")){
    this.serviceDescarga.descarga(usuario);
    }
    else {
        System.out.println("Debe de ser usuario Premium para descargar esta canción");
    }
    }
}
