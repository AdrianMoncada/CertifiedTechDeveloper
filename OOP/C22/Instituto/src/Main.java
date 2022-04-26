public class Main {
    public static void main(String[] args) {
        Vendible frontEnd = new Curso("Front End","JavaScript, CSS, HTML",16.0,2.0,1000.0);
        Vendible backEnd = new Curso("Back End","Java",20.0,2.0,900.0);

        frontEnd.calcularPrecio();
        backEnd.calcularPrecio();

        ProgramaIntensivo fullStack = new ProgramaIntensivo("Full Stack","Front End + Back End",20.0);
        fullStack.addVendible(frontEnd);
        fullStack.addVendible(backEnd);

        Instituto digitalHouse = new Instituto();
        digitalHouse.addOfertaAcademica(frontEnd);
        digitalHouse.addOfertaAcademica(backEnd);
        digitalHouse.addOfertaAcademica(fullStack);
        digitalHouse.generarInforme();


    }
}