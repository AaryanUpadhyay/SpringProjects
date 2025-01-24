package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo1Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("Hello World....");
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Student student1= (Student) context.getBean("student1");
		
		System.out.println(student1);
		
	}

}
