package com.yezi.spring.annotation.b_di;

import com.yezi.spring.annotation.b_di.bean.Cat;
import com.yezi.spring.annotation.b_di.bean.Person;
import com.yezi.spring.annotation.b_di.config.QuickStartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDIApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);
        Person person = context.getBean(Person.class);
        Cat cat = context.getBean(Cat.class);

        System.out.println(person);
        System.out.println(cat);
    }
}
