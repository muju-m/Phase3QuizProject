package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.main")
public class Phase3QuizProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3QuizProjectApplication.class, args);
	}

}
