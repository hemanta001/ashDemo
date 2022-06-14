package com.api.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		System.out.println("I am spring boot init");
		SpringApplication.run(Demo2Application.class, args);
	}

}
