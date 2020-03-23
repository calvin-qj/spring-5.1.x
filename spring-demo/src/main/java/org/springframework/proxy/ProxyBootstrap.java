package org.springframework.proxy;

import org.springframework.proxy.busi.Hello;
import org.springframework.proxy.busi.HelloInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyBootstrap {

	public static void main(String[] args) {
		System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

		HelloInterface hello = new Hello();

		InvocationHandler proxyHandler = new ProxyHandler(hello);

		HelloInterface proxyInstance = (HelloInterface)Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), proxyHandler);
		String everyBody = proxyInstance.sayHello("every body");

	}
}
