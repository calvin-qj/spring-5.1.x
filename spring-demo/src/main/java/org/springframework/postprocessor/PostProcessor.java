package org.springframework.postprocessor;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class PostProcessor {

	@PostConstruct
	public void init(){
		System.out.println("------>初始化init");
	}


	public PostProcessor(){
		System.out.println("------>构造器方法postProcessor");
	}

}
