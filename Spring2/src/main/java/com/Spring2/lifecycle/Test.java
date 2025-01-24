package com.Spring2.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Spring2/lifecycle/config.xml");
//		Sam S1 = (Sam) context.getBean("S1");
//		System.out.println(S1);
		context.registerShutdownHook();
//		
//		System.out.println("----------------------");
//		Pepsi P1=(Pepsi) context.getBean("P1");
//		System.out.println(P1);
		Example example=(Example) context.getBean("example");
		System.out.println(example);
	}
		

}
