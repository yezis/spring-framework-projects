package com.yezi.spring.basic_dl.d_withanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.stream.Stream;

public class AllBeannamesApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        String[] beans = context.getBeanDefinitionNames();

        Stream.of(beans).forEach(System.out::println);
    }
}
