package com.fishc.designPatterns.proxy;

/**
 * @Author: panchichun
 * @Date: 2018/10/15
 * @Description:
 */
public class GiveClient {

    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy proxy = new Proxy(jiaojiao);
        proxy.GiveDolls();
        proxy.GiveChocolate();
        proxy.GiveFlowers();

    }
}
