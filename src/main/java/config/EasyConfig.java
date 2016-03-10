package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wait.services.HelloWorldService;
import com.wait.services.HelloWorldServiceEnglish;
import com.wait.services.HelloWorldServicePolishImpl;

@Configuration
public class EasyConfig {

	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEnglish() {
		return new HelloWorldServiceEnglish();
	}
	@Bean
	@Profile("polish")
	public HelloWorldService helloWorldServicePolishImpl() {
		return new HelloWorldServicePolishImpl();
	}
}
