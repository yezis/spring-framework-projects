package com.yezi.spring.environment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yezi.spring.environment.bean")
@PropertySource("classpath:propertysource/jdbc.properties")
public class EnvironmentConfiguration {


}
