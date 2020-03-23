package org.springframework.bootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@EnableCaching
@SpringBootApplication
public class BootStartBootstrap {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(BootStartBootstrap.class, args);
		Object bean = applicationContext.getBean("factoryBeanTestService");
		System.out.println(bean.getClass().getSimpleName());
	}

}
