package com.fishc.designPatterns.decorator;

/**
 * @Author: panchichun
 * @Date: 2018/10/12
 * @Description: 人
 */
public class Person {
    private String name;

    public Person(){
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + this.name);
    }
}
