package com.em.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String... args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloSpring object = (HelloSpring) context.getBean("EdwinMendez");
		object.saySomething();
		
	}
	
}
