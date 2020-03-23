package org.springframework.calculate;

import org.springframework.calculate.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MainConfig {

	@Bean
	public CalculateService calculateService(){
		return new CalculateServiceImpl();
	}

	@Bean
	public LogAspect logAspect(){
		return new LogAspect();
	}
}
