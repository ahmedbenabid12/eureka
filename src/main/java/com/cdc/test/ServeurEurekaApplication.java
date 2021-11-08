package com.cdc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //pour que le serveur démarre automatiquement 
public class ServeurEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurEurekaApplication.class, args);
	}
// modification a traves eclipse  
	//version 2
}
