package com.example.ejercicios4.services;

import com.example.ejercicios4.models.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop getLaptop(Long id);
    Boolean createLaptop(Laptop laptop);
    List<Laptop> allLaptops();
}
