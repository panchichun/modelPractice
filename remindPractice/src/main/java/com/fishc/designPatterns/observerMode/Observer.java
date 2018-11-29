package com.fishc.designPatterns.observerMode;


/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description:
 */
public abstract class Observer {

    private String name;
    private Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }
}
