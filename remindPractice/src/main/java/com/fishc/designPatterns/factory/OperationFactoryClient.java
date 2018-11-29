package com.fishc.designPatterns.factory;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/11/9
 * @Description:
 */
public class OperationFactoryClient {

    public static void main(String[] args) {
        OperationFactory operationFactory = new addFactory();
        Operation operation = operationFactory.createOperation();
        operation.setNumber1(new BigDecimal(3));
        operation.setNumber2(new BigDecimal(4));
        System.out.println("operation:result##" + operation.result());

    }
}
