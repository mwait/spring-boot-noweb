package com.wait.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.wait.services.HelloWorldFactory;
import com.wait.services.HelloWorldService;


@Configuration
public class EasyConfig {

	@Bean
	public HelloWorldFactory helloWordFactory(){
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile("english")
	@Primary
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory fabryka) {
		return fabryka.getHelloWorldService("english");
	}
	@Bean
	@Profile("polish")
	@Primary
	public HelloWorldService helloWorldServicePolishImpl(HelloWorldFactory fabryka) {
		return fabryka.getHelloWorldService("polish");
	}
	
	@Bean
	public HelloWorldService helloWorldServiceRussianImpl(HelloWorldFactory fabryka) {
		return fabryka.getHelloWorldService("russian");
	}
}
