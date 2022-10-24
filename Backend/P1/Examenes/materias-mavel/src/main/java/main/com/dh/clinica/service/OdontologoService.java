package main.com.dh.clinica.service;

import main.com.dh.clinica.dao.IDao;
import main.com.dh.clinica.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIdao;

    public OdontologoService(IDao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public Odontologo guardar(Odontologo odontologo){
        return this.odontologoIdao.guardar(odontologo);
    }

    public Odontologo buscar(int id){
        return this.odontologoIdao.buscar(id);
    }

    public List<Odontologo> buscarTodos(){
        return this.odontologoIdao.buscarTodos();
    }
}
