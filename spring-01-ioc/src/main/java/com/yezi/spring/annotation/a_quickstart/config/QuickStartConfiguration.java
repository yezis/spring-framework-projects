package com.yezi.spring.annotation.a_quickstart.config;

import com.yezi.spring.annotation.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickStartConfiguration {

    @Bean
    public Person person(){
        return new Person();
    }

}
