package com.fishc.designPatterns.strategyMode;

import java.math.BigDecimal;

/**
 * @Author: panchichun
 * @Date: 2018/10/9
 * @Description: 客户端调试类
 */
public class CashClient {

    public static void main(String[] args) {
        CashSuper cs = CashFactory.createCashAccept("打7折");

        System.out.println( cs.acceptCash(new BigDecimal("500")));

        CashContext cc = new CashContext("打7折");
        System.out.println(cc.getResult(new BigDecimal("700")));

    }
}
