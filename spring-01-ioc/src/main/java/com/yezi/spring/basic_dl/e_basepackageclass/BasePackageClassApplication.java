package com.yezi.spring.basic_dl.e_basepackageclass;

import com.yezi.spring.basic_dl.e_basepackageclass.config.BasePackageClassConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class BasePackageClassApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasePackageClassConfiguration.class);
        String[] beanNams = context.getBeanDefinitionNames();
        Stream.of((beanNams)).forEach(System.out::println);
    }
}
