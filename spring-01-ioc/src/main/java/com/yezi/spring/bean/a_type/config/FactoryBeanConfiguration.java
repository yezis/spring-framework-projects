package com.yezi.spring.bean.a_type.config;

import com.yezi.spring.bean.a_type.bean.Child;
import com.yezi.spring.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactoryBean() {
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child());

        return toyFactoryBean;
    }

}
