package com.ak.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class ConfigSwaggerApi implements WebMvcConfigurer{
	@Bean
	public Docket createDocket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ak.controller"))
				.paths(PathSelectors.regex("/api.*"))
				.build()
				.useDefaultResponseMessages(true)
				.apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo() {
		Contact contact=new Contact("raja", "https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui/2.9.2", "akshay@Gmail.com");
		return new ApiInfo("JavaFullStack", "learning", "Aksha3.3 realse","akshay.com", contact, "java full stack", "license gnu",Collections.EMPTY_LIST);
	}
		
}
