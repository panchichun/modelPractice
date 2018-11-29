package com.fishc.designPatterns.builderMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description:
 */
public class PersonFatBuilder extends PersonBuilder {

    @Override
    public void BuildHead() {
        System.out.println("头");
    }

    @Override
    public void BuildBody() {
        System.out.println("微胖");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("左手");
    }

    @Override
    public void BuildArmRight() {
        System.out.println("右手");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("左腿");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("右腿");
    }
}
