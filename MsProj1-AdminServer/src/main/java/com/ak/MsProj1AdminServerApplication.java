package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MsProj1AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj1AdminServerApplication.class, args);
	}

}
