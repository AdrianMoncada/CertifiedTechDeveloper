import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Persona persona = new Persona("Javier", "Test");
        persona.setEdad(LocalDate.of(2000, 4, 12));

        System.out.println(persona.esMayorDeEdad());

    }
}