package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {

	@GetMapping("/details")
	public String index() {
		return "Name: Umansh Sarabhai \n Employee ID: 22XXX \n Location: Mumbai";
	}

}