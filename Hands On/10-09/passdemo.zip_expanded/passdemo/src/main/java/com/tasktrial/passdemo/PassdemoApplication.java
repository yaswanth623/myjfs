package com.tasktrial.passdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PassdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassdemoApplication.class, args);
		System.out.println("Service is up");
	}

}
