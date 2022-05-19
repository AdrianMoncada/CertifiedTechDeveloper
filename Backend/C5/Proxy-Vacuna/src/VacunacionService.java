public class VacunacionService implements IVacunacion{

    @Override
    public void vacunar(Persona persona) {
        System.out.println("Puede vacunarse " + persona);
    }
}
