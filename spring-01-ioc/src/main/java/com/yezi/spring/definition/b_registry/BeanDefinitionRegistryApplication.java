package com.yezi.spring.definition.b_registry;

import com.yezi.spring.definition.b_registry.config.BeanDefinitionRegistryConfiguration ;
import com.yezi.spring.definition.b_registry.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionRegistryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanDefinitionRegistryConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);

    }

}
