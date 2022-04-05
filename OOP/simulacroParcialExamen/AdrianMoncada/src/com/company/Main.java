package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alumno adrian = new Alumno("Adrián","Moncada", "28264E");

        Parcial infraestructuraI = new Parcial(adrian, "Primer parcial Infraestructura", "Docker - Cloud", 10.0, 3);
        Parcial POO = new Parcial(adrian, "Primer parcial POO", "Spring Java", 3.0, 3);
        infraestructuraI.puedeRecuperarse();
        POO.puedeRecuperarse();

        Final frontEndII = new Final(adrian,"Formularios", "Crear una página en base al siguiente figma", 10.0,10.0,"Muy bueno.");
        Final designThinking = new Final(adrian,"Conociendo al usuario", "Entrevistar a un actor", 10.0,3.0,"Muy bueno.");

        frontEndII.estaAprobado();
        designThinking.estaAprobado();

        frontEndII.compareTo(designThinking);
    }

}
