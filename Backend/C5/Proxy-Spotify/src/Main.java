public class Main {
    public static void main(String[] args) {

    Usuario zoe = new Usuario("Premium","666");
    Usuario lopi = new Usuario("Free", "456");

    Descargable proxyDescarga = new ProxyDescarga(new ServiceDescarga());

    proxyDescarga.descarga(zoe);
    proxyDescarga.descarga(lopi);
    }
}