package com.yezi.spring.environment;

import com.yezi.spring.environment.bean.EnvironmentHolder;
import com.yezi.spring.environment.config.EnvironmentConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnvironmentConfiguration.class);
        EnvironmentHolder environmentHolder = context.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }

}
