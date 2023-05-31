package com.ejemplo.ejemploSpring;

import com.ejemplo.ejemploSpring.entidades.Libro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjemploSpringApplication.class, args);

		/*
		Libro l1 = new Libro();
		l1.setAnioPublicacion(1999);
		System.out.println(l1.toString());


		Libro l1 = Libro.builder()
				.anioPublicacion(1960)
				.titulo("Titulo uno")
				.build();

		System.out.println(l1.toString());*/



	}

}
