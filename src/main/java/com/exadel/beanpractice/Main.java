package com.exadel.beanpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = loadContext();
	}

	private static ApplicationContext loadContext() {
		return new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
