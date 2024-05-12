package com.ak;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class MsProj1ConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MsProj1ConfigServerApplication.class, args);
	}

}
