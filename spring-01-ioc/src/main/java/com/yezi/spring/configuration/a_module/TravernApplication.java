package com.yezi.spring.configuration.a_module;

import com.yezi.spring.configuration.a_module.bean.Bartender;
import com.yezi.spring.configuration.a_module.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Map;
import java.util.stream.Stream;

public class TravernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("===========================================");
        Map<String, Bartender> bartenderMap = context.getBeansOfType(Bartender.class);
        bartenderMap.forEach((name, bean) -> System.out.println(bean));
    }
}
