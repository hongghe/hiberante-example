package com.hongghe.hiberanteexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HiberanteExampleApplication {

	@Bean
	public HibernateExampleInitializer hibernateExampleInitializer() {
		return new HibernateExampleInitializer();
	}

	@Bean
	public HibernateExampleExampleConfig hibernateExampleExampleConfig() {
		return new HibernateExampleExampleConfig();
	}

	@Bean
	public HibernateExampleWebConfig hibernateExampleWebConfig() {
		return new HibernateExampleWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(HiberanteExampleApplication.class, args);
	}
}
