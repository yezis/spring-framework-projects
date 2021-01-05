package com.yezi.spring.lifecycle.a_initmethod.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pen {
    private Integer ink;

    @PostConstruct
    public void addInk() {
        System.out.println("钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("钢笔中的墨水已清空。。。");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "ink=" + ink +
                '}';
    }
}
