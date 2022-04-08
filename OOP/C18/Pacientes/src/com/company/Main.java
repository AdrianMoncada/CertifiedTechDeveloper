package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
	    Paciente paciente= new Paciente("Juan","Perez","12345",new Date(99,4,7));
        } catch (PacienteException e) {
            e.printStackTrace();
        }

        Paciente paciente1= new Paciente("Juan","Perez","12345",new Date(2022,4,1), new Date(2022,4,9));

        try {
            paciente1.darAlta(new Date(2022,3,1));
        } catch (PacienteException e) {
            e.printStackTrace();
        }
    }
}
