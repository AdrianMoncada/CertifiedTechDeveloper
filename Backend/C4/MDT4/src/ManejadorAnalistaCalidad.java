public abstract class ManejadorAnalistaCalidad {
    protected ManejadorAnalistaCalidad siguienteManejador;

    public ManejadorAnalistaCalidad getSiguiente(){
        return this.siguienteManejador;
    }

    public void setSiguiente(ManejadorAnalistaCalidad manejador){
        this.siguienteManejador = manejador;
    }

    public abstract void validarCalidadDelProducto(Articulo articulo);
}
