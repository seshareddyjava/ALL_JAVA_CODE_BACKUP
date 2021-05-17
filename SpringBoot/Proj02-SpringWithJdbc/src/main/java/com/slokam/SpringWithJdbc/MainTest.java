package com.slokam.SpringWithJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Manager mgr=context.getBean(Manager.class);
		
		mgr.doWork();
	}

}
