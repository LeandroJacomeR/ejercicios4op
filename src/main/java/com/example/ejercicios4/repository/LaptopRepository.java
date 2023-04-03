package com.example.ejercicios4.repository;

import com.example.ejercicios4.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
