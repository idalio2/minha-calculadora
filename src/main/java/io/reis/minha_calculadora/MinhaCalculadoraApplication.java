package io.reis.minha_calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal responsável por inicializar a aplicação Spring Boot.
 * A anotação @SpringBootApplication habilita a auto‑configuração do Spring Boot.
 */
@SpringBootApplication
public class MinhaCalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhaCalculadoraApplication.class, args);
	}
}

