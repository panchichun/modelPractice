package com.fishc.designPatterns.strategyMode;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/10/9
 * @Description: 返利类
 */
public class CashReturn extends CashSuper{

    private BigDecimal moneyCondition = new BigDecimal(0.0);

    private BigDecimal moneyReturn = new BigDecimal(0.0);

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = new BigDecimal(moneyCondition);
        this.moneyReturn = new BigDecimal(moneyReturn);
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
       BigDecimal result = money;
       if(1 == result.compareTo(this.moneyCondition)){
         result = money.subtract(this.moneyReturn);
       }
       return result;
    }
}
