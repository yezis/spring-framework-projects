package com.yezi.spring.bean.a_type;

import com.yezi.spring.bean.a_type.bean.Toy;
import com.yezi.spring.bean.a_type.config.FactoryBeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);
        Toy toy = context.getBean(Toy.class);
        System.out.println(toy);
    }

}
