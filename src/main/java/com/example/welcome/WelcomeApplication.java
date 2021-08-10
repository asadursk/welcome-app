package com.example.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeApplication implements CommandLineRunner {

	@Autowired
	private CustomConfig myConfig;

	@Value("${spring.description}")
	private String description;

	@Value("${spring.name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WelcomeApplication.class);

		app.run();
	}

	public void run(String... args) throws Exception {
		System.out.println("Application name: " + name);
		System.out.println("Description: " + description);
	}
}
