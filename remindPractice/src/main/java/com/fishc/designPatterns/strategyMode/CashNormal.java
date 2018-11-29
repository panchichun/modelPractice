package com.fishc.designPatterns.strategyMode;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/10/9
 * @Description: 现金正常收费类
 */
public class CashNormal extends CashSuper {

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
