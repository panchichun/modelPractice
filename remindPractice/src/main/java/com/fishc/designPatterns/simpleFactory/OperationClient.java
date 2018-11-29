package com.fishc.designPatterns.simpleFactory;

import java.math.BigDecimal;

public class OperationClient {

    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("-");
        oper.setNumberA(new BigDecimal(1));
        oper.setNumberB(new BigDecimal(2));
        System.out.println(oper.getResult());
    }
}
