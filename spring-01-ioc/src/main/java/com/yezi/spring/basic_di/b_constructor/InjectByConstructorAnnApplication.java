package com.yezi.spring.basic_di.b_constructor;

import com.yezi.spring.basic_di.b_constructor.bean.Person;
import com.yezi.spring.basic_di.b_constructor.config.InjectByConstructorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectByConstructorAnnApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectByConstructorConfiguration.class);
        Person person = context.getBean(Person.class);

        System.out.println(person);
    }
}
