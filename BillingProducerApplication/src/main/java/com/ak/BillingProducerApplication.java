package com.ak;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@EnableDiscoveryClient
public class BillingProducerApplication {

	@Value(value="${spring.datasource.driver-class-name}")
	private String dirver;
	@Value(value="${spring.datasource.url}")
	private String url;
	@Value(value="${spring.datasource.username}")
	private String username;
	@Value(value="${spring.datasource.password}")
	private String password;

	//@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dirver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
	public static void main(String[] args) {
		SpringApplication.run(BillingProducerApplication.class, args);
	}

}
