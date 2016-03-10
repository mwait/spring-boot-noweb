package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.wait.controllers.GreetingController;

@SpringBootApplication
//@ComponentScan({"com.wait", "config"})
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringBootNowebApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootNowebApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.getHome();
	}
}
