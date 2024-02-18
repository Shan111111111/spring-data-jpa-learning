package com.shantesh.springdatajpalearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLearningApplication.class, args);
		System.out.println("spring data jpa object table mapping by spring JPA annotations which maps object's fields and objects to table columns and tables");
	}

}
