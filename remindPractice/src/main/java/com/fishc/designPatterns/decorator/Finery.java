package com.fishc.designPatterns.decorator;

/**
 * @Author: panchichun
 * @Date: 2018/10/12
 * @Description: 装饰类
 */
public class Finery extends Person {

    protected Person person;

    public void decoreate(Person component) {
        this.person = component;
    }

    @Override
    public void show() {
        if(person != null) {
            person.show();
        }
    }
}
