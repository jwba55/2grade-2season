package com.student.studentintroduce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RootController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
}
