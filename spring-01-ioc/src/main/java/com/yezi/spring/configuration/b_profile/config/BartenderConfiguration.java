package com.yezi.spring.configuration.b_profile.config;

import com.yezi.spring.configuration.b_profile.bean.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
public class BartenderConfiguration {

    @Bean
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }

    @Bean
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }

}
