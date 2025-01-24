package com.Spring2.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Spring2/spel/config.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression=temp.parseExpression("22+33");
		System.out.println(expression.getValue());

	}

}
