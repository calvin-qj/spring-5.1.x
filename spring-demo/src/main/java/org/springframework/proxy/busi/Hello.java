package org.springframework.proxy.busi;

public class Hello implements HelloInterface {
	@Override
	public String sayHello(String msg) {
		System.out.println("-----Hello,"+msg);
		return "Hello,"+msg;
	}
}
