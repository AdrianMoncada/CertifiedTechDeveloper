package com.example.mdt.services;

import com.example.mdt.models.Odontologo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService {

    private List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoService(){
        odontologos.add(new Odontologo(1L, "Menendez", "Juana", "M-J-123"));
    }

    public List<Odontologo> getAll() {
        return odontologos;
    }

    public Odontologo getOdontologoById(long id) {
        return odontologos.stream().filter(x -> x.getId() == (id)).findFirst().orElse(null);
    }

}