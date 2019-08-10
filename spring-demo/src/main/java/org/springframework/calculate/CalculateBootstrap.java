package org.springframework.calculate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculateBootstrap {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		CalculateService service = (CalculateService) applicationContext.getBean(CalculateService.class);
		service.add(1,2);
	}
}
