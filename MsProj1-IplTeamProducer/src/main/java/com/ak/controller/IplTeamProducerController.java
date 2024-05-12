package com.ak.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Team-service")
public class IplTeamProducerController {

	@Autowired
	private DataSource datasource;
	
	@GetMapping("/endpoint")
	public String demo() {
		return datasource + "name";
	}
}
