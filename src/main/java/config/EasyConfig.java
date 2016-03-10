package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory fabryka) {
		return fabryka.getHelloWorldService("english");
	}
	@Bean
	@Profile("polish")
	public HelloWorldService helloWorldServicePolishImpl(HelloWorldFactory fabryka) {
		return fabryka.getHelloWorldService("polish");
	}
	
	@Bean
	@Profile("russian")
	public HelloWorldService helloWorldServiceRussianImpl(HelloWorldFactory fabryka) {
		return fabryka.getHelloWorldService("russian");
	}
}
