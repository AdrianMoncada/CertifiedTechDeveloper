public class Verde implements StateSemaforo{

    // Referencia a la clase de contexto
    private Semaforo v;
    // Constructor que inyecta la dependencia en la clase actual

    public Verde(Semaforo v) {
        this.v = v;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo está en verde!");
    }

    @Override
    public void cambiarEstado() {
        v.setEstado(new Amarillo(v));
        System.out.println("El semáforo cambia de estado a amarillo!");
    }
}
