public class Amarillo implements StateSemaforo{
    private Semaforo v;

    public Amarillo(Semaforo v) {
        this.v = v;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo está en amarillo!");
    }

    @Override
    public void cambiarEstado() {
        v.setEstado(new Rojo(v));
        System.out.println("El semáforo cambia de estado a rojo!");
    }
}
