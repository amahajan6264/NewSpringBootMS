package com.ak.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@PropertySource("classpath:log4j2.properties")
public class WebConfig implements WebMvcConfigurer {
	
	private static final Logger log=LoggerFactory.getLogger(WebConfig.class);
	
	public WebConfig() {
		log.debug("webconfig class object is created");
		log.trace("webconfig class object is created");
		log.error("webconfig class object is created");
	}
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		log.debug("\"GET\", \"POST\", \"PUT\", \"DELETE\"");
		registry.addMapping("/api/**") // Specify your API endpoints
				.allowedOrigins("http://localhost:4200") // Allow requests from this origin
				.allowedMethods("GET", "POST", "PUT", "DELETE") // Specify allowed methods
				.allowedHeaders("*"); // Allow JSON and plain text headers
	}
	

}
