package com.dailycode.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {

	@GetMapping("/test")
	String getResponse(){
		
		return "data getting";
	}
}
