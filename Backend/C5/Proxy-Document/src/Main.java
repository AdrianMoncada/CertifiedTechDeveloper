import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> usuariosAutorizados = Arrays.asList("adrian.ignaciomoncada@gmail.com", "santi123@gmail.com");
        IConexionDocument proxy = new ProxyDocument("04756","www.mydocument.com/myDocs/004562","...",usuariosAutorizados);

        proxy.ingresarA("www.mydocument.com/myDocs/004562", "adrian.ignaciomoncada@gmail.com");
        proxy.ingresarA("www.mydocument.com/myDocs/006666", "adrian.ignaciomoncada@gmail.com");
        proxy.ingresarA("www.mydocument.com/myDocs/004562", "ab123@gmail.com");
    }
}