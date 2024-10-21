package com.fazendaprojet.fazendapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class FazendappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FazendappApplication.class, args);
	}

}
