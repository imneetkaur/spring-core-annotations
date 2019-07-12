package com.stackroute.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Actor {

    //private String type;
    private String name;
    private String gender;
    private int age;

    //empty Constructor
    public Actor(){

    }

    //parametrized Constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        //this.type=type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
        @Override
        public String toString() {
            return "Actor{" +
                    "type='" + type + '\'' +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }*/
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
