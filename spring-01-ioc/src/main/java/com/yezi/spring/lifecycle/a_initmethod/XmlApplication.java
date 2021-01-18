package com.yezi.spring.lifecycle.a_initmethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {
    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/quickstart-init-destroy.xml");
        System.out.println("IOC容器初始化完成。。。");

        System.out.println();

        System.out.println("准备销毁IOC容器。。。");
        context.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
