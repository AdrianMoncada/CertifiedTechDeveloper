package com.example.odontologo.services;

import com.example.odontologo.dominio.Odontologo;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class OdontologoServiceImpl implements OdontologoService{
    @Override
    public List<Odontologo> listaOdontologos() {
        return Arrays.asList(new Odontologo("Javier"), new Odontologo("Ramon"));
    }
}
