package org.springframework.autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springframework.autowire")
public class AutowireConfig {
}
