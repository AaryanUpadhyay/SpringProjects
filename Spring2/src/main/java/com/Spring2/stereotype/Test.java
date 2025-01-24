package com.Spring2.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring2/stereotype/stereoconfig.xml");
		Student student= context.getBean("student",Student.class);
		System.out.println(student);
	}

}
