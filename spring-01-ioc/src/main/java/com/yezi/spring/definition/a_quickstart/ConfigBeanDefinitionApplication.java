package com.yezi.spring.definition.a_quickstart;

import com.yezi.spring.definition.a_quickstart.config.BeanDefinitionConfiguration;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigBeanDefinitionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanDefinitionConfiguration.class);
        BeanDefinition personBeanDefinition = context.getBeanDefinition("person");
        System.out.println(personBeanDefinition);
        System.out.println(personBeanDefinition.getClass().getName());
    }
}
