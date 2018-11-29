package com.fishc.designPatterns.decorator;

/**
 * @Author: panchichun
 * @Date: 2018/10/15
 * @Description: 客户端
 */
public class FineryClient {

    public static void main(String[] args) {
        Person person = new Person("小菜");

        System.out.println("第一种状装扮");
        Tshirt tshirt = new Tshirt();
        BigTrouser bigTrouser = new BigTrouser();

        tshirt.decoreate(person);
        bigTrouser.decoreate(tshirt);
        bigTrouser.show();
    }
}
