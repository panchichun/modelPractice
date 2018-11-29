package com.fishc.web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: panchichun
 * @Date: 2018/11/27
 * @Description:
 */
public class Person {

    public static List<Person> createRoster() {
        Person person = new Person();
        person.name = "123";
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        return personList;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){ this.emailAddress = emailAddress;}

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
       return 1;
    }

    public void printPerson() {
        System.out.println("123");
    }
}