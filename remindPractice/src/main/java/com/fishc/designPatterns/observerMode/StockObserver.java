package com.fishc.designPatterns.observerMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description: 看股票同事
 */
public class StockObserver extends Observer{

    public StockObserver(String name, Subject sub) {
      super(name,sub);
    }

    public void update() {
        System.out.println("关闭股票行情，继续工作!" + this.getSub().subjectState + this.getName());
    }
}
