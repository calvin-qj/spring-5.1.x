package org.springframework.calculate;

public interface CalculateService {

	public int add(int a, int b);

	public int reduce(int a, int b);

	public int multi(int a, int b);

	public double div(int a, int b);

	public int mod(int a, int b);
}
