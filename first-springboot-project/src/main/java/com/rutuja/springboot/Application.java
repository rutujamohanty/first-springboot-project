package com.rutuja.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rutuja")
// @ComponentScan("com.rutuja")--> It will scan the entire package to find any component class existance
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Welcome to SpringBoot");

	}

}

// Note--> How does Spring framework knows where to search for beans to manage--> ComponentScan