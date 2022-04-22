public class ArchivoTexto implements Archivo{
    private String nombre;

    public ArchivoTexto(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void getNombre() {
        System.out.println(this.nombre);
    }
}
