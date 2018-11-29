package com.fishc.designPatterns.strategyMode;

import java.math.BigDecimal;

/**
 *
 * @Author: panchichun
 * @Date: 2018/10/9
 * @Description: 现金抽象类
 */
public abstract class CashSuper {

    public abstract BigDecimal acceptCash(BigDecimal money);
}
