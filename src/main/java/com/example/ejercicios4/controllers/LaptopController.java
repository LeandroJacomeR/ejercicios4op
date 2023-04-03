package com.example.ejercicios4.controllers;

import com.example.ejercicios4.models.Laptop;
import com.example.ejercicios4.services.LaptopServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LaptopController {

    @Autowired
    private LaptopServiceImp laptopServiceImp;

    @GetMapping(value = "/laptop/{id}")
    public ResponseEntity getLaptop(@PathVariable Long id){
        try {
            return new ResponseEntity<>(laptopServiceImp.getLaptop(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("No se encontraron laptops", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/laptop")
    public ResponseEntity createLaptop(@RequestBody Laptop laptop){

        Map response = new HashMap();
        Boolean laptopRes = laptopServiceImp.createLaptop(laptop);
        System.out.println(laptopRes);

        if (laptopRes == true){
            response.put("status", "201");
            response.put("message", "Se creo la laptop");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }else{
            response.put("status", "400");
            response.put("message", "Error al crear una laptop");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/laptops")
    public ResponseEntity allLaptops(){
        try {
            return new ResponseEntity<>(laptopServiceImp.allLaptops(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("No hay laptops en la base de datos", HttpStatus.NOT_FOUND);
        }
    }
}
