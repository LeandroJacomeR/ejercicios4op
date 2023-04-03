package com.example.ejercicios4;

import com.example.ejercicios4.models.Laptop;
import com.example.ejercicios4.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicios4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicios4Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "asus" , "intel", "14'", "8gb", "250gb", "nvidia");
		Laptop laptop2 = new Laptop(null, "lenovo" , "intel", "16'", "4gb", "500gb", "nvidia");

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
