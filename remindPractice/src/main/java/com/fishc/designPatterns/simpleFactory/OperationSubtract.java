package com.fishc.designPatterns.simpleFactory;

import java.math.BigDecimal;

public class OperationSubtract extends Operation{

    @Override
    public BigDecimal getResult() {
        BigDecimal result = getNumberA().subtract(getNumberB());
        return result;
    }
}
