package org.springframework.myboot.configure;

import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@HandlesTypes(MyInterfaceWebApplicationInitializer.class)
public class MySpringServletContainerInitializer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> webAppInitializerClasses, ServletContext servletContext) throws ServletException {
		List<MyInterfaceWebApplicationInitializer> initializers = new LinkedList<MyInterfaceWebApplicationInitializer>();
		System.out.println("tomcat容器启动。。。。。。。。");
		if (webAppInitializerClasses != null) {
			for (Class<?> waiClass : webAppInitializerClasses) {
				try {
					initializers.add((MyInterfaceWebApplicationInitializer)
							ReflectionUtils.accessibleConstructor(waiClass).newInstance());
				}
				catch (Throwable ex) {
					throw new ServletException("Failed to instantiate WebApplicationInitializer class", ex);
				}

			}
		}

		if (initializers.isEmpty()) {
			servletContext.log("No Spring WebApplicationInitializer types detected on classpath");
			return;
		}

		servletContext.log(initializers.size() + " Spring WebApplicationInitializers detected on classpath");
		AnnotationAwareOrderComparator.sort(initializers);
		for (MyInterfaceWebApplicationInitializer initializer : initializers) {
			initializer.onStartup(servletContext);
		}
	}
}
