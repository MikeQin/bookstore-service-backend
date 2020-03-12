package com.example.circuitbreaker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreServiceEndpoint {

	@RequestMapping(value = "/recommended")
	public String readingList() {
		return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
	}

}
