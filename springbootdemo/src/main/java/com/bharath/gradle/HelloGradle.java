package com.bharath.gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradle {
	
	@GetMapping("/hello")
	public String hello() {
		return "Spring Boot With Gradle is Super Easy";
	}

}
