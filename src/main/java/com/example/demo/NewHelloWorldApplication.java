package com.example.demo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

//import com.example.demo.component.DemoBean;
//import com.example.demo.controller.HelloRestController;

@SpringBootApplication
public class NewHelloWorldApplication {
//	public static final Logger logger = LoggerFactory.getLogger(NewHelloWorldApplication.class);

	public static void main(String[] args) {
//I-SPRING DEMO WITH STS		
		System.out.println("Hello from Bridgelabz");
		SpringApplication.run(NewHelloWorldApplication.class, args);
	
		
//II-USING SYSTEM OUT		
//		System.out.println("Welcome to Spring Concept Demo");
//		ApplicationContext context = SpringApplication.run(NewHelloWorldApplication.class, args);
//		DemoBean demoBean = context.getBean(DemoBean.class);
//		System.out.println("Demo Bean = "+demoBean.toString());
//		System.out.println(context.getBean(HelloRestController.class));
	
//III-USING LOGGERS
//		logger.debug("Welcome to Spring Concept Demo");
//		ApplicationContext context = SpringApplication.run(NewHelloWorldApplication.class, args);
//		DemoBean demoBean = context.getBean(DemoBean.class);
//		logger.debug("Demo Bean = "+demoBean.toString());
//		System.out.println(context.getBean(HelloRestController.class));
	}

}
