package com.fishc.designPatterns.simpleFactory;

import java.math.BigDecimal;

public class OperaitonAdd extends Operation {

    @Override
    public BigDecimal getResult() {
        BigDecimal result = getNumberA().add(getNumberB());
        return result;
    }
}
