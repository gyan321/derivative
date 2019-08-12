package com.luv2code.springBoot.demo.myCoolApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")	
	public String sayHello(){
		return "hello world"+LocalDateTime.now();
	}
	

}
