import java.util.Date;

public class Hotel {
    private Date fechaEntrada;
    private Date fechaSalida;
    private String ciudad;

    public Hotel(Date fechaEntrada, Date fechaSalida, String ciudad) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public String getCiudad() {
        return ciudad;
    }
}
