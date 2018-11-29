package com.fishc.designPatterns.observerMode;

/**
 * @Author: panchichun
 * @Date: 2018/11/27
 * @Description:
 */
public abstract class Subject {

    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notifys();

    String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
