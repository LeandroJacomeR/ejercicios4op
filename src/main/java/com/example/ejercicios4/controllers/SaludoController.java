package com.example.ejercicios4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("hola")
    public String saludo(String hola){
        return "Saludando desde spring";
    }
}
