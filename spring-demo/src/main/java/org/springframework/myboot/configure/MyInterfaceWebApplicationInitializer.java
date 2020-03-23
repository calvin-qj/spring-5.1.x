package org.springframework.myboot.configure;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public interface MyInterfaceWebApplicationInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException;
}
