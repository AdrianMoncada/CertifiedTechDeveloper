public class Main {
    public static void main(String[] args) {
        BarcoA random = new BarcoA();

        random.addCarga(CargaFactory.LCD_32);
        random.addCarga(CargaFactory.MEDS);

        random.addCarga(CargaFactory.CONTENEDOR_1108);

        random.mostrarCargas();
    }
}