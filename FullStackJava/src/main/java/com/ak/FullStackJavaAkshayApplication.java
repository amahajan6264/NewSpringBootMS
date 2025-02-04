package com.ak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:query.properties")
public class FullStackJavaAkshayApplication {
	
	private static final Logger logger=LoggerFactory.getLogger(FullStackJavaAkshayApplication.class);
	
	public static void main(String[] args) {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		SpringApplication.run(FullStackJavaAkshayApplication.class, args);
	}

}
