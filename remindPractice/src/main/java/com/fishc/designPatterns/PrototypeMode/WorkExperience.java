package com.fishc.designPatterns.PrototypeMode;

/**
 * @Author: panchichun
 * @Date: 2018/10/16
 * @Description:
 */
public class WorkExperience implements Cloneable{

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
