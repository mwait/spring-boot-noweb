package com.wait.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("polish")
public class HelloWorldServicePolishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {
		return "Pozdrawiam";
	}

}
