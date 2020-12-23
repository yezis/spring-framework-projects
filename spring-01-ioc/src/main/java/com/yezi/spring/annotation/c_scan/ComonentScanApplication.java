package com.yezi.spring.annotation.c_scan;

import com.yezi.spring.annotation.c_scan.bean.Cat;
import com.yezi.spring.annotation.c_scan.bean.Person;
import com.yezi.spring.annotation.c_scan.config.QuickStartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComonentScanApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);
        Person person = context.getBean(Person.class);
        Cat cat = context.getBean(Cat.class);

        System.out.println(person);
        System.out.println(cat);
    }
}
