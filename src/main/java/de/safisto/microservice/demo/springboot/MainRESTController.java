package de.safisto.microservice.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainRESTController {

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(MainRESTController.class, args);
	}

}
