public class Articulo {
    private String nombre;
    private Integer peso;
    private Integer lote;
    private String envasado;

    public Articulo(String nombre, Integer peso, Integer lote, String envasado) {
        this.nombre = nombre;
        this.peso = peso;
        this.lote = lote;
        this.envasado = envasado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }
}
