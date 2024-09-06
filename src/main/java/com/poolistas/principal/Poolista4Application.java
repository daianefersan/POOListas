package com.poolistas.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.poolistas.principal.listamatematica4.Exercicio1;
import com.poolistas.principal.listamatematica4.Exercicio2;

@SpringBootApplication
public class Poolista4Application {


	public static void main(String[] args) {
		SpringApplication.run(Poolista4Application.class, args);

		Exercicio2.resolucao();
		
	}

}