package com.yezi.spring.configuration.b_profile.annotation;

import com.yezi.spring.configuration.b_profile.bean.Boss;
import com.yezi.spring.configuration.b_profile.config.BarConfiguration;
import com.yezi.spring.configuration.b_profile.config.BartenderConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarConfiguration.class})
public @interface EnableTavern {
}
