package com.fishc.designPatterns.observerMode;


/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description:
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println("关闭NBA直播，继续工作!" + super.getSub().subjectState + this.getName());
    }
}
