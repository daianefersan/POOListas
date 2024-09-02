package com.poolista1.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolista1.principal.listamatematica2.Exercicio1;
import com.poolista1.principal.listamatematica2.Exercicio2;

@SpringBootApplication
public class Poolista2Application {

	public static void main(String[] args) {
		SpringApplication.run(Poolista1Application.class, args);

		Exercicio2.resolucao();
		
	}

}
