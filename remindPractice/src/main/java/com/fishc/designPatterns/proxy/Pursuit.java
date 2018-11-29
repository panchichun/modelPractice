package com.fishc.designPatterns.proxy;

/**
 * @Author: panchichun
 * @Date: 2018/10/15
 * @Description:
 */
public class Pursuit implements GiveGift{

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public void GiveDolls() {
        System.out.println(mm.getName() + ",送你洋娃娃");
    }

    public void GiveFlowers() {
        System.out.println(mm.getName() + ",送给你鲜花");
    }

    public void GiveChocolate() {
        System.out.println(mm.getName() + ",送你巧克力");
    }
}
