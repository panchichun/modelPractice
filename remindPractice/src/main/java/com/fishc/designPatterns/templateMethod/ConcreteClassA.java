package com.fishc.designPatterns.templateMethod;

/**
 * @Author: panchichun
 * @Date: 2018/11/12
 * @Description:
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    public String answer1() {
        return "B";
    }

    @Override
    public String answer2() {
        return "C";
    }
}
