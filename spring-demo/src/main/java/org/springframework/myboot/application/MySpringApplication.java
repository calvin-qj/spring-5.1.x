package org.springframework.myboot.application;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class MySpringApplication {
	public static void run(){
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8181);
		try {
			tomcat.addWebapp("/","D:\\");
			tomcat.start();
			tomcat.getServer().await();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
