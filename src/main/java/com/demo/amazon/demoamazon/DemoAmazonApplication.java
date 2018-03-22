package com.demo.amazon.demoamazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAmazonApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello Amazon";
	}
}
