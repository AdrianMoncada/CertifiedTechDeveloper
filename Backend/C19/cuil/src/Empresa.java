import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {
    private String cuit;
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", empleados=" + empleados +
                '}';
    }

    public void addEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public ArrayList imprimirEmpleado() {
        ArrayList lista = new ArrayList();
        for (Empleado empleado : empleados) {
            String empleadoIterado = empleado.getNombre() + "; " + empleado.getApellido() + "; " + empleado.getLegajo() + "; " + empleado.getSueldo() + "\n";

            lista.add(empleadoIterado);
        }
        return lista;
    }
}
