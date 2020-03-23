package org.springframework.servlet;

import org.springframework.servlet.service.HelleService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;
//容器启动的时候会将@HandlesTypes指定的这个类型(HelloService)下面的子类(实现类、子接口等)传递过来
@HandlesTypes(value = {HelleService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
	/**
	 * 应用启动的时候 会运行onStartup
	 * @param c 感兴趣的类型的所有子类 就是@HandlesTypes注解下的子类、子接口等
	 * @param ctx 代表当前web应用的ServletContext; 一个Web应用一个ServletContext
	 * @throws ServletException
	 *
	 * 使用ServletContext注册WEB组件(Servlet 、Filter 、Listener)
	 */
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

	}
}
