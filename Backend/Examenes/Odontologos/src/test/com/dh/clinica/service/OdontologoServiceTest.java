package test.com.dh.clinica.service;

import main.com.dh.clinica.dao.impl.OdontologoDAOH2;
import main.com.dh.clinica.model.Odontologo;
import main.com.dh.clinica.service.OdontologoService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)

public class OdontologoServiceTest {
    private static OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

    @BeforeClass
    public static void cargarDataSet() {
        Odontologo odontologo = odontologoService.guardar(new Odontologo("13141516","Federico", "Ponce"));
        Odontologo odontologo1 = odontologoService.guardar(new Odontologo("17181920","Matilda", "Cáceres"));
    }

    @Test
    public void traerTodos() {
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        Assert.assertTrue(!odontologos.isEmpty());
        Assert.assertTrue(odontologos.size() > 0);
        System.out.println(odontologos);
    }
}
