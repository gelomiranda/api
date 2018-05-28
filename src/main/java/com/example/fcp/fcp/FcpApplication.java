package com.example.fcp.fcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FcpApplication.class, args);
	}
}
