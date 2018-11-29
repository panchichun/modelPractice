package com.fishc.designPatterns.observerMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description:
 */
public class ObserverClient {

    public static void main(String[] args) {
        //老板
        Subject huhansan = new Boss();

        //看股票的同事
        Observer tongshi1 = new StockObserver("魏光鑫", huhansan);
        Observer tongshi2 = new NBAObserver("易管查", huhansan);

        //前台记下了这两位同事
        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);

        huhansan.detach(tongshi1);

        //发现老板回来了
        huhansan.subjectState = "我胡汉三回来了！";

        //通知同事
        huhansan.notifys();

    }
}
