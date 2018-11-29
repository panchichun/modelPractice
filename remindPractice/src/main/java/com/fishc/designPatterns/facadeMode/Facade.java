package com.fishc.designPatterns.facadeMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/12
 * @Description:
 */
public class Facade {
    SystemOne one;
    SystemTwo two;
    SystemThree three;

    public Facade() {
        one = new SystemOne();
        two = new SystemTwo();
        three = new SystemThree();
    }

    public void methodA() {
        System.out.println("A组系统--");
        one.methodOne();
        two.methodTwo();
    }

    public void methodB() {
        System.out.println("B组系统--");
        three.methodThree();
    }
}
