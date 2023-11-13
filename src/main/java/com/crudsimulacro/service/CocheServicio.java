package com.crudsimulacro.service;

import com.crudsimulacro.dao.CocheRepositorio;
import com.crudsimulacro.model.Coche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CocheServicio {

    @Autowired
    private CocheRepositorio repositorio;
    public List<Coche> obtenerTodos() {

        List<Coche> coches = new ArrayList<Coche>();
        Iterable<Coche> coches_iterator = repositorio.findAll();

        for (Coche coche : coches_iterator) {
            coches.add(coche);
        }

        return coches;
    }
}
