package com.demo.io.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  16:16:37
 * @Version 1.0.0
 */

public class Student implements Serializable {

    private String name;
    private String gender;
    private int age;
    private Class classz;//班级

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

    public Student(){

    }

    public Student(String name, String gender, int age,Class classz) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classz = classz;
    }

    public Class getClassz() {
        return classz;
    }

    public void setClassz(Class classz) {
        this.classz = classz;
    }
}
