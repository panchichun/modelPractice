package com.fishc.designPatterns.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: panchichun
 * @Date: 2018/11/27
 * @Description:
 */
public class Boss extends Subject {

    //同事列表
    private List<Observer> observerList = new ArrayList<Observer>();

    private String action;

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifys() {
        for (Observer observerInfo: observerList) {
            observerInfo.update();
        }
    }

    //老板状态
    public String subjectState;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
