package org.springframework.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.service.UserService;

public class TransactionBootstrap {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		UserService bean = context.getBean(UserService.class);
		bean.saveUser();
	}
}
