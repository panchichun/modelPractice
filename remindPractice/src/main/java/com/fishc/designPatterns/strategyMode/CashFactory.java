package com.fishc.designPatterns.strategyMode;

/**
 * @Author: panchichun
 * @Date: 2018/10/9 09 37
 * @Description:
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {

        CashSuper cashSuper = null;

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
        return cashSuper;

    }
}
