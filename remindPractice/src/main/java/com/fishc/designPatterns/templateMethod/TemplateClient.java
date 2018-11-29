package com.fishc.designPatterns.templateMethod;

/**
 * @Author: panchichun
 * @Date: 2018/11/12
 * @Description:
 */
public class TemplateClient {

    public static void main(String[] args) {
        AbstractClass ac1 = new ConcreteClassA();
        ac1.templateMethod();

        AbstractClass ac2 = new ConcreteClassB();
        ac2.templateMethod();
    }
}
