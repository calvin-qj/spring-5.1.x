package org.springframework.myboot.configure;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements MyInterfaceWebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("初始化1 MyWebApplicationInitializer");
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfig.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

		ServletRegistration.Dynamic registration = servletContext.addServlet("/",dispatcherServlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}
}
