package com.wait.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wait.services.HelloWorldService;

@Controller
public class GreetingController {

	@Autowired
	private HelloWorldService helloWorldService;

	public String getHome(){
		String pozdrowienia = helloWorldService.getGreeting();
		System.out.println(pozdrowienia);
		return pozdrowienia;
	}
	
}
