package com.exadel.beanpractice.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("ALL")
public class Application {

	private static final String DEFAULT_APPLICATION_CONTEXT_LOCATION = "applicationContext.xml";

	private static ApplicationContext applicationContext;

	public static void run() {
		applicationContext = loadContext();
	}

	private static ApplicationContext loadContext() {
		return new ClassPathXmlApplicationContext(DEFAULT_APPLICATION_CONTEXT_LOCATION);
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
