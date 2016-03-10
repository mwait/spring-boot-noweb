package com.wait.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.wait.services.HelloWorldService;

//@Controller
public class GreetingController {

	//@Autowired
	private HelloWorldService helloWorldService;
	//@Autowired
	//@Qualifier(value="helloWorldServiceRussianImpl")
	private HelloWorldService helloWorldServiceRussian;
	
	
	public String getHome(){
		String pozdrowienia = helloWorldService.getGreeting();
		System.out.println(pozdrowienia);
		System.out.println(helloWorldServiceRussian.getGreeting());
		return pozdrowienia;
	}


	public HelloWorldService getHelloWorldService() {
		return helloWorldService;
	}


	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}


	public HelloWorldService getHelloWorldServiceRussian() {
		return helloWorldServiceRussian;
	}


	public void setHelloWorldServiceRussian(HelloWorldService helloWorldServiceRussian) {
		this.helloWorldServiceRussian = helloWorldServiceRussian;
	}
	
	
	
}
