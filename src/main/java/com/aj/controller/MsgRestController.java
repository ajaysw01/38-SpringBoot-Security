package com.aj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contact")
	public String getContact() {
		
		return  "Contact us";
	}
	@GetMapping("/signUp")
	public String signUp() {
		return "Register Page ";
	}
	@GetMapping("/signin")
	public String signIn() {
		return " Signin Page";
	}
	
	
	

}
