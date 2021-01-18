package com.yezi.spring.configuration.b_profile;

import com.yezi.spring.configuration.b_profile.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.stream.Stream;

public class TravernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("city");
        context.register(TavernConfiguration.class);
        context.refresh();

        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
