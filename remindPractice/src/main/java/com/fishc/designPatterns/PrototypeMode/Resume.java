package com.fishc.designPatterns.PrototypeMode;

/**
 * @Author: panchichun
 * @Date: 2018/10/16
 * @Description:
 */
public class Resume implements Cloneable{

    private String name;
    private String age;
    private String sex;
/*    private String timeArea;
    private String company;*/
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) {
        try {
            this.workExperience = (WorkExperience)workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经验
    public void setWorkExperience(String timeArea, String company) {
        workExperience.setWorkDate(timeArea);
        workExperience.setCompany(company);
    }

    //显示
    public void display() {
        System.out.println(name +" " + sex + " " + age);
        System.out.println("工作经历： " + workExperience.getWorkDate() + workExperience.getCompany());
    }

    @Override
    public Object clone(){
        Resume resume = new Resume(this.workExperience);

        return resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
