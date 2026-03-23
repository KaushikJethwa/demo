package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/user")
	public String hello()
	{
		return "Hi User";
	}
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Our Page";
	}
	
}
