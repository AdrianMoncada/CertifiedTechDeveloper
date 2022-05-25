public class Ropa {

    private String talla;
    private String tipo;
    private Boolean esNuevo;
    private Boolean importada;

    public Ropa(String talla, String tipo, Boolean esNuevo, Boolean importada) {
        this.talla = talla;
        this.tipo = tipo;
        this.esNuevo = esNuevo;
        this.importada = importada;
    }

    public String getTalla() {
        return talla;
    }

    public String getTipo() {
        return tipo;
    }

    public Boolean getEsNuevo() {
        return esNuevo;
    }

    public Boolean getImportada() {
        return importada;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "talla='" + talla + '\'' +
                ", tipo='" + tipo + '\'' +
                ", esNuevo=" + esNuevo +
                ", importada=" + importada +
                '}';
    }
}
