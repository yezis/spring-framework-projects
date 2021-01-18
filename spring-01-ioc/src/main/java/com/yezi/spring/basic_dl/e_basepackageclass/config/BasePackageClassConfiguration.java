package com.yezi.spring.basic_dl.e_basepackageclass.config;

import com.yezi.spring.basic_dl.e_basepackageclass.bean.DemoService;
import com.yezi.spring.basic_dl.e_basepackageclass.component.DemoComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { DemoService.class, DemoComponent.class })
public class BasePackageClassConfiguration {
}
