package com.edu.ceub.pidi.coramdeo.cge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.edu.ceub.pidi.coramdeo.cge.models"})
@SpringBootApplication
public class CgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgeApplication.class, args);
	}

}
