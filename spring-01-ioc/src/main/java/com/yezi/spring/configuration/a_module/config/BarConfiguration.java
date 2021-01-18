package com.yezi.spring.configuration.a_module.config;

import com.yezi.spring.configuration.a_module.bean.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bbbar() {
        return new Bar();
    }

}
