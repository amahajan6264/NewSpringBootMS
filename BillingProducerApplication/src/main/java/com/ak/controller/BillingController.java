package com.ak.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
	
	@Value(value = "${username1}")
	private String username;
	
	@Value(value = "${spring.datasource.driver-class-name}")
	String  datasource;
	@Autowired
	DataSource dataSource2;
//	
	@Value(value="${password}")
	private String password;
	
	@GetMapping("/api/info")
	public ResponseEntity<String> getBill() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Integer billAmt = 400;
		System.out.println("getbill");
		return new ResponseEntity<String>(dataSource2+"== Bill Amount Is : "+username+" : "+password+" : "+ + billAmt, HttpStatus.OK);
	}
	
	public Long calculateBill() {
		System.out.println("calculate the bill");
		return 1212L;
	}
}
