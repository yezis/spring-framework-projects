package com.yezi.spring.definition.c_removedefinition;

import com.yezi.spring.definition.c_removedefinition.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("definition/definition-remove.xml");
        Person aqiang = (Person) context.getBean("aqiang");
        System.out.println(aqiang);

    }
}
