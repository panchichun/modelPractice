package com.fishc.designPatterns.builderMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description: 创建者模式
 */
public abstract class PersonBuilder {

    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();
}
