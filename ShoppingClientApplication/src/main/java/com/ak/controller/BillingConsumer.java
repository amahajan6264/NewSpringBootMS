package com.ak.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingConsumer {
	@Autowired
	private LoadBalancerClient client;
	public ResponseEntity<String> getBiilingInfo(){
		ServiceInstance si=client.choose("BillingProducerApplication");
		URI uri=si.getUri();
		String url=uri+"/billing/api/info";
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate.getForEntity(url, String.class);
	}
}
