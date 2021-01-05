package com.yezi.spring.lifecycle.a_initmethod;

import com.yezi.spring.lifecycle.a_initmethod.config.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoationApplication {
    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        System.out.println("IOC容器初始化完成。。。");

        System.out.println();

        System.out.println("准备销毁IOC容器。。。");
        context.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
