package com.student.studentintroduce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RootController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
}
