package com.yezi.spring.annotation.a_quickstart;

import com.yezi.spring.annotation.a_quickstart.bean.Person;
import com.yezi.spring.annotation.a_quickstart.config.QuickStartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationCofigApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
