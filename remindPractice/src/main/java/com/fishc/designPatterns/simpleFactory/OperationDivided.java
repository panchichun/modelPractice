package com.fishc.designPatterns.simpleFactory;

import java.math.BigDecimal;

public class OperationDivided extends Operation {

    @Override
    public BigDecimal getResult() {
        BigDecimal result = getNumberA().divide(getNumberB());
        return result;
    }
}
