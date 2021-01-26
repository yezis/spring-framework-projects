package com.yezi.spring.definition.a_quickstart.config;

import com.yezi.spring.definition.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinitionConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }

}
