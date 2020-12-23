package com.yezi.spring.basic_di.b_constructor.bean;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;
    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
