package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Value("${name}")
	public String name;

	@GetMapping("/hello")
	public String hello() {
		return "Hello " + this.name;
	}
}
