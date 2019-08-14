package com.demo.io.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  17:03:05
 * @Version 1.0.0
 */

public class Student implements Serializable {
    private String name;
    private String gender;
    private Integer age;

    public Student(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Student(){

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

    public void setAge(Integer age) {
        this.age = age;
    }
}
