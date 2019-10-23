package org.springframework.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class MainConfig {

	@Bean
	public PostProcessor postProcessor(){
		return new PostProcessor();
	}

	@Bean
	public PostProcessorInterect postProcessorInterect(){
		return new PostProcessorInterect();
	}
}
