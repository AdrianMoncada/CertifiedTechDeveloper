import java.util.ArrayList;
import java.util.List;

public class ProxyDocument implements IConexionDocument {
    private String id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;
    private DocumentService documentService;

    public ProxyDocument(String id, String url, String contenido, List<String> usuariosAutorizados) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.usuariosAutorizados = usuariosAutorizados;
        this.documentService = new DocumentService();
    }

    @Override
    public void ingresarA(String url, String mail) {
    if(this.usuariosAutorizados.contains(mail) && this.url.equals(url)){
    this.documentService.ingresarA(url, mail);
    }
    else
        System.out.println("Acceso denegado");

    }
}
