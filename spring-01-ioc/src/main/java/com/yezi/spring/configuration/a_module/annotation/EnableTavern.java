package com.yezi.spring.configuration.a_module.annotation;

import com.yezi.spring.configuration.a_module.bean.Boss;
import com.yezi.spring.configuration.a_module.config.BarConfiguration;
import com.yezi.spring.configuration.a_module.config.BartenderConfiguration;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarConfiguration.class})
public @interface EnableTavern {
}
