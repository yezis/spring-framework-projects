package com.yezi.spring.configuration.c_conditional.config;

import com.yezi.spring.configuration.c_conditional.bean.Bar;
import com.yezi.spring.configuration.c_conditional.conditional.ExistBossCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    @Conditional(ExistBossCondition.class)
    public Bar bbbar() {
        return new Bar();
    }

}
