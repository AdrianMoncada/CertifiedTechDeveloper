public class ControlEnvase extends Control{
    @Override
    public void validarCalidadDelProducto(Producto producto) {
        if ((producto.getEnvasado().equalsIgnoreCase("sano")) ||
                (producto.getEnvasado().equalsIgnoreCase("casi sano"))) {

            if(this.getSiguiente() != null) {
                this.getSiguiente().validarCalidadDelProducto(producto);
            }

            System.out.println("Fué aceptado");
        }
        else {
            System.out.println("Fué rechazado");
        }
    }
    }
