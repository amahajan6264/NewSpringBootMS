package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:query.properties")
public class FullStackJavaAkshayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackJavaAkshayApplication.class, args);
	}

}
