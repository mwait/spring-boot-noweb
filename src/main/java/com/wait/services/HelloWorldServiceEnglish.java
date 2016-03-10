package com.wait.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("english")
public class HelloWorldServiceEnglish implements HelloWorldService {

	@Override
	public String getGreeting() {
		return "Hellow World!!";
	}

}
