public class DocumentService implements IConexionDocument{
    @Override
    public void ingresarA(String url, String mail) {
        System.out.println(mail + " tiene acceso al documento alojado en: " + url);
    }
}
