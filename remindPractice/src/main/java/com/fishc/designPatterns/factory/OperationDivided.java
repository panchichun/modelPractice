package com.fishc.designPatterns.factory;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/11/9
 * @Description:
 */
public class OperationDivided extends Operation {

    @Override
    public BigDecimal result() {
        return super.getNumber1().divide(getNumber2());
    }

}
