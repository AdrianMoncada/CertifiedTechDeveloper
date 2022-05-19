public class AnalistaCalidad {
    Control inicial;

    public AnalistaCalidad() {
        this.inicial = new ControlLote();
        Control lote = new ControlLote();
        Control peso = new ControlPeso();
        Control envase = new ControlEnvase();

        inicial.setSiguiente(lote);
        lote.setSiguiente(peso);
        peso.setSiguiente(envase);
    }

    public void ValidarCalidadDelProducto(Producto producto) {
        inicial.validarCalidadDelProducto(producto);
    }
}
