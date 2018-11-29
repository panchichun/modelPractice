package com.fishc.designPatterns.templateMethod;

/**
 * @Author: panchichun
 * @Date: 2018/11/12
 * @Description:
 */
public class ConcreteClassB extends AbstractClass {

    @Override
    public String answer1() {
        return "A";
    }

    @Override
    public String answer2() {
        return "B";
    }
}
