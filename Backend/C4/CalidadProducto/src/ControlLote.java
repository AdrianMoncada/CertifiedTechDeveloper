public class ControlLote extends Control{

    @Override
    public void validarCalidadDelProducto(Producto producto) {
        if (producto.getLote() >= 1000 && producto.getLote() <= 2000) {
            if( this.getSiguiente() != null ) {
                this.getSiguiente().validarCalidadDelProducto(producto);
            }
        }
        else {
            System.out.println("Fué rechazado");
        }

    }
}
