package com.fishc.designPatterns.factory;

/**
 * @Author: panchichun
 * @Date: 2018/11/9
 * @Description:
 */
public class subtractFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSubtract();
    }
}
