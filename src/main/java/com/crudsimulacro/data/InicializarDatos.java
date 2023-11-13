package com.crudsimulacro.data;

// @TODO me falta importar la config

import com.crudsimulacro.dao.CocheRepositorio;
import com.crudsimulacro.model.Coche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InicializarDatos implements CommandLineRunner {

    @Autowired
    CocheRepositorio repositorio;

    // El siguiente comando se ejecuta antes que nada
    @Override
    public void run(String... args) throws Exception {
        Coche c = new Coche();
        c.setColor("Rojo");
        c.setMatricula("123456A");
        c.setMarca("Renault");
        repositorio.save(c);
    }
}
