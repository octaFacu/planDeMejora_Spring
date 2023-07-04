package com.ejemplo.ejemploSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjemploSpringApplication.class, args);

		//Libro l1 = new Libro();
		/*Libro l1 = Libro.builder()
				.titulo("Titulo dos")
				.anioPublicacion(1999)
				.build();

		System.out.println(l1.getTitulo());
		System.out.println(l1.toString());*/

	}

}
