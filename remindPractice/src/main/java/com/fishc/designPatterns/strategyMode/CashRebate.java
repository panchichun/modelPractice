package com.fishc.designPatterns.strategyMode;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/10/9
 * @Description: 折扣现金类
 */
public class CashRebate extends CashSuper{

    private BigDecimal moneyRebate = new BigDecimal(1);

    public CashRebate(String moneyRebate) {
        this.moneyRebate = new BigDecimal(moneyRebate);
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return this.moneyRebate.multiply(money);
    }
}
