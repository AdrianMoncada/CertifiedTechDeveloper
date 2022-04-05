package com.company;

public class Main {

    public static void main(String[] args) {
	Consulta consultaAM1104 = new Consulta("11/04/2022","Odontología",17,30);
    Consulta consultaAG1104 = new Consulta("11/04/2022","Odontología",18,30);

    PacienteConObraSocial adrianMoncada = new PacienteConObraSocial(consultaAM1104,"14/10/1995","Adrián","Moncada", true, "Jerárquicos Salud", 205205);
    PacienteConObraSocial adrianGimenez = new PacienteConObraSocial(consultaAG1104,"14/10/1995","Adrián","Gimenez", false, "Jerárquicos Salud", 205206);
    Particular adrianRamirez = new Particular(consultaAG1104,"14/10/1995","Adrián", "Martinez",true, 1800.0,"39254811");
    adrianMoncada.evaluacionClinicaInicial();
    adrianGimenez.evaluacionClinicaInicial();
    adrianMoncada.compareTo(adrianGimenez);

    }
}
