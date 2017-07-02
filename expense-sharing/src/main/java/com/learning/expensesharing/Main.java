package com.learning.expensesharing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"configxml.xml");
 
		HelloWorld service = (HelloWorld) context
				.getBean("helloWorld");
		String message = service.Hello();
		System.out.println(message);
	}
}
