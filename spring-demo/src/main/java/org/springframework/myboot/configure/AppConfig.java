package org.springframework.myboot.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;

/**
 * java代码实现类似于spring-context.xml的配置
 */
@Configuration
@ComponentScan("org.springframework.myboot")
public class AppConfig extends HttpServlet {

	public String string(){
		return new String("hello");
	}
}
