package com.fishc.designPatterns.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: panchichun
 * @Date: 2018/11/16
 * @Description:
 */
public class Secretary {

    //同事
    private List<Observer> observerList = new ArrayList<>();
    private String action;

    //添加
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    //减少
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    //通知
    public void notifys() {
        for (Observer so : observerList) {
            so.update();
        }
    }

    public String secretaryAction;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
