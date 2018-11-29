package com.fishc.designPatterns.factory;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/11/9
 * @Description:
 */
public class OperationMultiplying extends Operation {

    @Override
    public BigDecimal result() {
        return super.getNumber1().multiply(getNumber2());
    }
}
