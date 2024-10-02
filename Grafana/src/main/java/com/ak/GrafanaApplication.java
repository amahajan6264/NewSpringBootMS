package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrafanaApplication.class, args);
	}

	// Sample endpoint to monitor request count and response time
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
