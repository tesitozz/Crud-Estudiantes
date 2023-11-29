package com.sistema.crud;

import com.sistema.crud.entidad.Estudiante;
import com.sistema.crud.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SistemaCrudApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {

		/*
		Estudiante estudiante1 = new Estudiante("David","Sanchez","davidsanchez@gmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Leonardo","Sanchez","leonardo@gmail.com");
		repositorio.save(estudiante2);


		 */
	}
}
