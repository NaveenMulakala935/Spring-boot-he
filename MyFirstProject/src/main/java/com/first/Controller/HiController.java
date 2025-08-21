package com.first.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/hello")
public class HiController {
	@GetMapping("/hi") 
	public String hi() {
		return "hello, this is naveen";
	}
	
	@GetMapping("/bye")
	public String bye() {
		return "bye, from earth";
	}

}