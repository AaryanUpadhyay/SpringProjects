package com.Spring2.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        A temp=(A) context.getBean("aref");
        System.out.println(temp.getOb().getY());
        System.out.println(temp.getX());
        System.out.println(temp);
    }
}
