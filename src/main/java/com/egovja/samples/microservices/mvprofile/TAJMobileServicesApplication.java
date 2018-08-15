package com.egovja.samples.microservices.mvprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.egovja.samples.microservices.mvprofile.entities"})  // scan JPA entities
public class TAJMobileServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TAJMobileServicesApplication.class, args);
	}
}
