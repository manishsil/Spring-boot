package com.manish.sampleApplication;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	public String sampleEndPoint() {
		return "Sample Application deployed successfully in AWS";
	}
	
	
	@GetMapping(value = "/{name}")
	public String sampleEndPointWelcomeMsg(@PathVariable("name") String name) {
		return "Welcome "+name;
	}
	
	

}
