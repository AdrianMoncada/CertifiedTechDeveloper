public class ControlPeso extends Control{
    @Override
    public void validarCalidadDelProducto(Producto producto) {
        if (producto.getPeso() >= 1200 && producto.getPeso() <= 1300) {
            if( this.getSiguiente() != null ) {
                this.getSiguiente().validarCalidadDelProducto(producto);
            }
        }
        else {
            System.out.println("Fué rechazado");
        }
    }
}
