public class Main {
    public static void main(String[] args) {
        Realizable tarea1 = new TareaIndividual("Comprar Baterías","recordar pasar por el negocio de Pedro y comprar 2 baterías para la linterna",false);
        Realizable tarea2 = new TareaIndividual("Comprar Repelente Insectos", "recordar pasar por la farmacia y comprar 1 aerosol repelente de insectos",false);
        Realizable tarea3 = new TareaIndividual("Verificar que Kit Pesca esté Completo", "recordar revisar buen estado de anzuelos, plomadas y carreteles",true);

        Realizable proyecto1 = new Proyecto("Pendientes para Pesca Domingo","completar todas las pendientes para la pesca del domingo",false);

        proyecto1.InformarPorcentajeCompletitud();
    }
}