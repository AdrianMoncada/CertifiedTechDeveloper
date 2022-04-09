package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            Paciente paciente= new Paciente("Juan","Perez","12345",new Date("04/09/2022 19:35:00"));
            paciente.getFechaInternacion();
            paciente.darAlta(new Date("04/11/2022 12:25:56"));
            paciente.getFechaAlta();
        } catch (PacienteException e) {
            e.printStackTrace();
        }

    }
    }
