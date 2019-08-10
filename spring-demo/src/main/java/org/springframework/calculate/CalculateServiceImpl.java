package org.springframework.calculate;

import org.springframework.stereotype.Component;

@Component
public class CalculateServiceImpl implements CalculateService {

	@Override
	public int add(int a, int b) {
		System.out.println("======");
		return a+b;
	}

	@Override
	public int reduce(int a, int b) {
		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		return a*b;
	}

	@Override
	public double div(int a, int b) {
		return a/b;
	}

	@Override
	public int mod(int a, int b) {
		return 0;
	}
}
