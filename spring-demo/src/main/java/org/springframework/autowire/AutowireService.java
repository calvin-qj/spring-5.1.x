package org.springframework.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireService {

	@Autowired
	AutowireTestService autowireTestService;

	public int add(int a,int b){
		return a+b;
	}
}
