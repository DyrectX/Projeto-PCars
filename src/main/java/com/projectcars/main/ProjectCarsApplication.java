package com.projectcars.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ProjectCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCarsApplication.class, args);
	}

}
