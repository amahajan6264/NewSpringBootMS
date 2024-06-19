package com.ak.security;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.ak.security.model.UrlAccess;
import com.ak.seurity.repository.UrlAccessRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private static final Logger log = LoggerFactory.getLogger(SecurityConfig.class);

	@Autowired
	private UrlAccessRepository urlAccessRepository;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		System.out.println("SecurityConfig.securityFilterChain()");
		
		List<UrlAccess> urlAccessList = urlAccessRepository.findAll();

		urlAccessList.forEach(urlaccess->{
			log.debug(urlaccess.getUrl());
			System.out.println(urlaccess.getUrl());
		});

		http.authorizeRequests(authorizeRequests -> {
			authorizeRequests.antMatchers("/").permitAll();
			for (UrlAccess urlAccess : urlAccessList) {
				authorizeRequests.antMatchers(urlAccess.getUrl()).permitAll();
			}
			authorizeRequests.anyRequest().authenticated();
		});
		return http.build();
	}

}
