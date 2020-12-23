package com.yezi.spring.basic_di.b_constructor;

import com.yezi.spring.basic_di.b_constructor.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectByConstructorXmlApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/inject-constructor.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
