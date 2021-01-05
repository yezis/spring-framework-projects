package com.yezi.spring.bean.a_type.bean;

import org.springframework.beans.factory.FactoryBean;

public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball" :
                return new Ball("ball");
            case "car" :
                return new Car("car");
            default:
                return null;
        }

    }

    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
