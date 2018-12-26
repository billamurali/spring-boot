package com.sample.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.sample.springboot")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}