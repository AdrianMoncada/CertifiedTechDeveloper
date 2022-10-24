package name.com.dh.clinica;

import name.com.dh.clinica.dao.impl.PacienteDAOH2;
import name.com.dh.clinica.model.Paciente;
import name.com.dh.clinica.service.PacienteService;

public class Main {
    public static void main(String[] args) {
        /*create table IF NOT EXISTS pacientes(id BIGINT,apellido varchar(255),nombre varchar (255),dni varchar (255),fechaIngreso varchar (255),domicilio varchar (255));*/
        Paciente adrianMoncada = new Paciente("Moncada", "Adrián", "12345678910", "14/10/1995", "San Martín 3035");
        Paciente joaquinPaso = new Paciente("Paso", "Joaquín", "12345678911", "14/10/1994", "San Martín 3030");
        Paciente pabloCuadrado = new Paciente("Cuadrado", "Pablo", "12345678912", "14/10/1993", "San Martín 3036");
        adrianMoncada.setId(1L);
        joaquinPaso.setId(2L);
        pabloCuadrado.setId(3L);

        PacienteService pacienteService = new PacienteService();
        pacienteService.setPacienteIDao(new PacienteDAOH2());

        pacienteService.guardar(adrianMoncada);
        pacienteService.guardar(joaquinPaso);
        pacienteService.guardar(pabloCuadrado);
        /*pacienteService.eliminar(1L);*/
        /*System.out.println(pacienteService.buscar(1L));*/
        System.out.println(pacienteService.buscarTodos());


    }
}
