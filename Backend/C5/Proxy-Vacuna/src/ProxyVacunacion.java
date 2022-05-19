import java.util.ArrayList;

public class ProxyVacunacion implements IVacunacion{
    private ArrayList<Persona> personasInscriptas;
    private VacunacionService vacunacionService;

    public ProxyVacunacion(ArrayList<Persona> personasInscriptas) {
        this.personasInscriptas = personasInscriptas;
        this.vacunacionService = new VacunacionService();
    }

    @Override
    public void vacunar(Persona persona) {
        for (Persona personaInscripta : personasInscriptas) {
            if(personaInscripta.getDni().equals(persona.getDni()) &&
            personaInscripta.getFechaVacunacion().equals(persona.getFechaVacunacion())){
                this.vacunacionService.vacunar(persona);
            }
        else
                System.out.println("Su vacunación no se encuentra para el día de hoy. Recuerde registrarse antes");
        }
    }
}
