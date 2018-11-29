package com.fishc.designPatterns.facadeMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/12
 * @Description: 外观模式
 */
public class FacadeClient {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();

    }
}
