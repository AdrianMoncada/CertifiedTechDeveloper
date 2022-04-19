public class Rojo implements StateSemaforo{
    private Semaforo v;

    public Rojo(Semaforo v) {
        this.v = v;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo está en rojo!");
    }

    @Override
    public void cambiarEstado() {
        v.setEstado(new Amarillo(v));
        System.out.println("El semáforo cambia a amarillo!");
    }
}
