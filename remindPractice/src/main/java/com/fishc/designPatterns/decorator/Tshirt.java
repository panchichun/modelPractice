package com.fishc.designPatterns.decorator;

/**
 * @Author: panchichun
 * @Date: 2018/10/12
 * @Description:
 */
public class Tshirt extends Finery{

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
