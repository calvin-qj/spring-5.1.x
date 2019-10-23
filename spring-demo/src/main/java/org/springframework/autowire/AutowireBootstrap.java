package org.springframework.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireBootstrap {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
		AutowireTestService testService = context.getBean(AutowireTestService.class);
		testService.doCalculate();
	}
}
