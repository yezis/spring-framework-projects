package com.yezi.spring.basic_di.b_constructor.config;

import com.yezi.spring.basic_di.b_constructor.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectByConstructorConfiguration {

    @Bean
    public Person person(){
        return new Person("test-person-2", 24);
    }

}
