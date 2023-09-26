package com.springmaven.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/hello")
	public String application() {
		return "Welcome to SpringBoot Application...kindly enjoy it";
	}
}
