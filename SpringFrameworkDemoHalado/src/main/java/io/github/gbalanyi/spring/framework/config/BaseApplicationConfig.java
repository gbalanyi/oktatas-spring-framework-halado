package io.github.gbalanyi.spring.framework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "io.github.gbalanyi.spring.framework")
@PropertySource("classpath:application.properties")
public class BaseApplicationConfig {
}
