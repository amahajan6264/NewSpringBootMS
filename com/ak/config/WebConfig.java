package com.ak.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**") // Specify your API endpoints
				.allowedOrigins("http://localhost:4200") // Allow requests from this origin
				.allowedMethods("GET", "POST", "PUT", "DELETE") // Specify allowed methods
				.allowedHeaders("*"); // Allow JSON and plain text headers
	}

}
