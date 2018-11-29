package com.fishc.designPatterns.builderMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description: 建造者模式
 */
public class PersonClient {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonThinBuilder();
        PersonDirector pdThin = new PersonDirector(personBuilder);
        pdThin.createPerson();

        PersonBuilder pb = new PersonFatBuilder();
        PersonDirector pdfat = new PersonDirector(pb);
        pdfat.createPerson();

    }
}
