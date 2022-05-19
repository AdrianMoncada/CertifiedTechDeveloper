public abstract class Control {
    protected Control siguienteControl;

    public Control getSiguiente(){
        return siguienteControl;
    }
    public void setSiguiente(Control control){
        this.siguienteControl = control;
    }

    public abstract void validarCalidadDelProducto(Producto producto);
}
