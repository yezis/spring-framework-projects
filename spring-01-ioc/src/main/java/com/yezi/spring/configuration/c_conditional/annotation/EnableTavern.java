package com.yezi.spring.configuration.c_conditional.annotation;

import com.yezi.spring.configuration.c_conditional.bean.Boss;
import com.yezi.spring.configuration.c_conditional.config.BarConfiguration;
import com.yezi.spring.configuration.c_conditional.config.BartenderConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({BartenderConfiguration.class, BarConfiguration.class})
public @interface EnableTavern {
}
