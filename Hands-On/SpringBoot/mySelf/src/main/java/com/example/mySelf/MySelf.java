package com.example.mySelf;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySelf {
	@GetMapping("/self")
	public String spring()
	{
		return "My name is Surya \n I have enrolled in Anudip Foundation for Java Course ";
	}
}
