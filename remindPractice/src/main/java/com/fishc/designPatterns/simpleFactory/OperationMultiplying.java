package com.fishc.designPatterns.simpleFactory;

import java.math.BigDecimal;

public class OperationMultiplying extends Operation {

    @Override
    public BigDecimal getResult() {
        BigDecimal result = getNumberA().multiply(getNumberB());
        return result;
    }
}
