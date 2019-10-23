package org.springframework.postprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostProcessorBootstrap {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		context.close();
	}
}
