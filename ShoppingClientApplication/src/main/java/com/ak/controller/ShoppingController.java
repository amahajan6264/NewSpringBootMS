package com.ak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shooping-service")
public class ShoppingController {

	@Autowired
	private BillingConsumer billingConsumer;

	@GetMapping("/shop")
	public ResponseEntity<String> doShopping(){
		ResponseEntity<String> billInfo=billingConsumer.getBiilingInfo();
		String bill=billInfo.getBody();
    	return new ResponseEntity<String>(bill+" With 10% discount",HttpStatus.OK);
    }

}
