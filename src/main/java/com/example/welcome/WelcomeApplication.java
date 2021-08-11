package com.example.welcome;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeApplication {

	@Value("${spring.description}")
	private String description;

	@Value("${spring.name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApplication.class);
	}
}
