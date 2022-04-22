public class ArchivoVideo implements Archivo{
    private String nombre;

    public ArchivoVideo(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void getNombre() {
        System.out.println(this.nombre);
    }
}
