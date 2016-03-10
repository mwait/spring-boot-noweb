package com.wait.services;

public class HelloWorldFactory {

	public HelloWorldService getHelloWorldService(String choice) {
		HelloWorldService helloWorldService = null;

		switch (choice) {
		case "polish":
			helloWorldService = new HelloWorldServicePolishImpl();
			break;
		case "english":
			helloWorldService = new HelloWorldServiceEnglish();
			break;
		case "russian":
			helloWorldService = new HelloWorldServiceRussianImpl();
			break;
		default:
			helloWorldService = new HelloWorldServicePolishImpl();
		}
		
		return helloWorldService;
	}
}
