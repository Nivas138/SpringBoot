package com.learningstudent.restwebservice.learingrestframework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * To make RestFul Webservice have to make this as Rest Controller
 * 
 * */

@RestController
public class firstmuyatchi {
	
	//Get Method - Rest Framework
	//To Get the firstmuyartchistep1 result using GET HTTP Request Method in this Service
	
	@RequestMapping(method = RequestMethod.GET,path="/firstmuyartchi_inspring")
	public String firstmuyatchiStep1 () {
		return "Vetri Namathe ! Thuninthu Sel !";
	}
	
	@GetMapping(path="/firstmuyartchi_inspring_step2")
	public String firstmuyatchiStep2() {
		return "Success lies in taking risks! Thuninthu Sel!";
	}
	
	@GetMapping(path="/firstmuyartchi_inspring_step3_bean/{name}")
	public FirstMuyartchiBean firstmuyatchiBean(@PathVariable String name) {
		return new FirstMuyartchiBean(String.format("Hello %s , Burn the Purspose to Grow ! Thuninthu Sel!",name));
	}

	
}
