package com.example.ejercicios4.services;

import com.example.ejercicios4.models.Laptop;
import com.example.ejercicios4.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImp implements LaptopService{

    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public Laptop getLaptop(Long id){
        return laptopRepository.findById(id).get();
    }

    @Override
    public Boolean createLaptop(Laptop laptop){
        try{
            laptopRepository.save(laptop);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Laptop> allLaptops() {
        return null;
    }
}
