package net.codejava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

	public static void main(String[] args) {
		ApplicationContext appContext
			= new ClassPathXmlApplicationContext("classpath:src/main/resource/applicationContext.xml");
		
		Client client = (Client) appContext.getBean("client1");
		client.doSomething();
	}

}
