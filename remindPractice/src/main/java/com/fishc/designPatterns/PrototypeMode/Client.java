package com.fishc.designPatterns.PrototypeMode;

/**
 * @Author: panchichun
 * @Date: 2018/10/16
 * @Description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        Resume r = new Resume("小菜");
        r.setPersonalInfo("男","28");
        r.setWorkExperience("1999-2015", "xx公司");

        Resume  b = (Resume)r.clone();
        b.setPersonalInfo("女","28");
        b.setWorkExperience("1996-2016", "xx公司");

/*        Resume c = (Resume)r.clone();
        r.setPersonalInfo("女","18");
        c.setWorkExperience("1997-2018", "xx公司");*/

        r.display();
        b.display();
/*
        c.display();
*/



    }
}
