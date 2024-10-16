package com.example.webflux_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.example.webflux_example")
public class WebfluxExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebfluxExampleApplication.class, args);
	}
}
