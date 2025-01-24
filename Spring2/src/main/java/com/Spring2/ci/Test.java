package com.Spring2.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World.....");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring2/ci/ciconfig.xml");
		Person p=(Person) context.getBean("person");
		System.out.println(p);
		
		Addition add=(Addition) context.getBean("add");
		add.doSum();
	}

}
