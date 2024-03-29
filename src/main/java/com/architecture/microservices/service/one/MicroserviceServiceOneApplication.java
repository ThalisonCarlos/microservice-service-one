package com.architecture.microservices.service.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServiceOneApplication.class, args);
	}

}
