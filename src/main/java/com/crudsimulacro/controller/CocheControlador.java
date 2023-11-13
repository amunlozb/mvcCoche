package com.crudsimulacro.controller;

import com.crudsimulacro.service.CocheServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CocheControlador {
    @Autowired
    private CocheServicio servicio;
    @GetMapping("/coches")
    public String mostrarListado(Model model) {
        model.addAttribute("coches", servicio.obtenerTodos());
        return "coches";
    }
}
