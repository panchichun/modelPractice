package com.fishc.designPatterns.strategyMode;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/10/12
 * @Description: 策略模式，上下文
 */
public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type) {
        switch(type) {
            case "正常收费" :
                cashSuper = new CashNormal();
                break;
            case "满500减200" :
                cashSuper = new CashReturn("500","200");
                break;
            case "打7折" :
                cashSuper = new CashRebate("0.7");
                break;
        }
    }

    public BigDecimal getResult(BigDecimal money){
         return cashSuper.acceptCash(money);
    }
}
