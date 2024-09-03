package com.student.studentintroduce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/user")
public class RootController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	
	
	
}
