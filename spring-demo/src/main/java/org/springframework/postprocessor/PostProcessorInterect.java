package org.springframework.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PostProcessorInterect implements InstantiationAwareBeanPostProcessor , BeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if(beanName.equalsIgnoreCase("postprocessor")){
			System.out.println("------->实例化之前");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if(beanName.equalsIgnoreCase("postprocessor")){
			System.out.println("------->实例化之后");
		}
		return false;
	}



	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equalsIgnoreCase("postprocessor")){
			System.out.println("------->初始化之前");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equalsIgnoreCase("postprocessor")){
			System.out.println("------->初始化之后");
		}
		return bean;
	}
}
