package com.ak.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.integration.TeamConsumer;

@RestController
@RequestMapping("/iplteam")
public class IplTeamServiceController {
	@Autowired
	DataSource datasource;
	@Autowired
	private TeamConsumer teamConsumer;
	@GetMapping("/demo")
	public ResponseEntity<String> demo() throws SQLException{
		
		return new ResponseEntity<String>(teamConsumer.getEndpointData()+" : "+datasource.getConnection().getSchema() ,HttpStatus.OK);
	}
}
