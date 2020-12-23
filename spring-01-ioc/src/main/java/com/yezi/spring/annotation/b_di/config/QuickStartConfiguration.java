package com.yezi.spring.annotation.b_di.config;

import com.yezi.spring.annotation.b_di.bean.Cat;
import com.yezi.spring.annotation.b_di.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickStartConfiguration {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("test-person");
        person.setAge(22);

        return person;
    }

    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("test-cat");
        cat.setMaster(this.person());

        return cat;
    }

}
