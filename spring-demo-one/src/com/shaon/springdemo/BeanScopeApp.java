package com.shaon.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach anotherCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == anotherCoach);
		
		System.out.println("\n Pointing to same memory: "+ result);
		System.out.println("\n location for theCoach: "+ theCoach);
		System.out.println("\n location for anotherCoach: "+ anotherCoach);
		
		context.close();

	}

}
