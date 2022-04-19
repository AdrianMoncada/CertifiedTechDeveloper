public class Main {
    public static void main(String[] args) {
        Semaforo avenidaCorrientes = new Semaforo();
        avenidaCorrientes.mostrarAviso();
        avenidaCorrientes.cambiarEstado();
        avenidaCorrientes.mostrarAviso();
        avenidaCorrientes.cambiarEstado();
        avenidaCorrientes.mostrarAviso();
        avenidaCorrientes.cambiarEstado();
    }
}