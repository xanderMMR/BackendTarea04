package pe.upc.eruekaservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class MiEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiEurekaApplication.class, args);
	}

}
