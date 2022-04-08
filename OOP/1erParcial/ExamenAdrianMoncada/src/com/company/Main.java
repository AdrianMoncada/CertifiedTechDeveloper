package com.company;

public class Main {

    public static void main(String[] args) {
	Persona adrianMoncada = new Persona("Adrián","Moncada","39245811", 26);

    TituloTerciario administracion = new TituloTerciario(adrianMoncada,20,"10/10/2020","10/10/2022",true,true,"PROVINCIAL");
    administracion.esValidoNacional();
    administracion.sePuedeEjercer();

    TituloLicenciatura economia = new TituloLicenciatura(adrianMoncada,40,"10/10/2020","10/10/2022",true,true,"Economía en Pandemia","10/09/2022",5);
    TituloLicenciatura informatica = new TituloLicenciatura(adrianMoncada,40,"10/10/2020","10/10/2022",true,true,"Economía en Pandemia","10/09/2022",3);

    economia.compareTo(informatica);
    informatica.compareTo(economia);

    }
}
