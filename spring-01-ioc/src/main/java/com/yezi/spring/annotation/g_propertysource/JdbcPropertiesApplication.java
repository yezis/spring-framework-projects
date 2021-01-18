package com.yezi.spring.annotation.g_propertysource;

import com.yezi.spring.annotation.g_propertysource.bean.JdbcProperties;
import com.yezi.spring.annotation.g_propertysource.config.JdbcPropertiesConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcPropertiesApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcPropertiesConfiguration.class);
        JdbcProperties jdbcProperties = context.getBean(JdbcProperties.class);
        System.out.println(jdbcProperties);
    }

}
