package com.yezi.spring.annotation.c_scan.config;

import com.yezi.spring.annotation.c_scan.bean.Cat;
import com.yezi.spring.annotation.c_scan.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yezi.spring.annotation.c_scan")
public class QuickStartConfiguration {

}
