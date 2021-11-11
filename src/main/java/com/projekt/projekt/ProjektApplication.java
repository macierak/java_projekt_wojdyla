package com.projekt.projekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.projekt.projekt.Controllers.WebController", " com.projekt.projekt.Controllers.DatabaseController"})
public class ProjektApplication {

	public static void main(String... args) {
		SpringApplication.run(ProjektApplication.class, args);
	}

}
