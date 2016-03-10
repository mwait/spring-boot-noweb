package com.wait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wait.controllers.GreetingController;

@SpringBootApplication
public class SpringBootNowebApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootNowebApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.getHome();
	}
}
