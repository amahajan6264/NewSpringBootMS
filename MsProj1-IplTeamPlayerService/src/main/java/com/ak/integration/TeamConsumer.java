package com.ak.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "IplTeamProducer" , url = "http://127.0.0.1:8085/Team-service/")
public interface TeamConsumer {
	 @GetMapping("/endpoint")
	  String getEndpointData();
}
