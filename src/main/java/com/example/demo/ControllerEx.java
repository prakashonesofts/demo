package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEx {
	
	@GetMapping("/get")
	public String msg() {
		return "Helloworld";
	}

}
