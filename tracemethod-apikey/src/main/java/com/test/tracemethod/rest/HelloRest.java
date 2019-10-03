package com.test.tracemethod.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

	@GetMapping("/api/rest/greeting/{name}")
	public String handleGreeting(@PathVariable("name") String name) {
		return "Hello : "+name;
	}
}
