package com.fishc.designPatterns.decorator;

/**
 * @Author: panchichun
 * @Date: 2018/10/12
 * @Description:
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }

}
