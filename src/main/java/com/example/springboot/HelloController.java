package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return sayHelloTo(null);
	}
	
	@GetMapping("/hello/{to}")
	@ResponseBody
	public String helloTo(@PathVariable String to) {
		return sayHelloTo(to);
	}
	
	private String sayHelloTo(String to) {
		return "hello " + (to == null ? "world" : to);
	}

}
