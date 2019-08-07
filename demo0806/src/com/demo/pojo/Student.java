package com.demo.pojo;

/**
 * @ClassName Student
 * 学生类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  13:50:29
 * @Version 1.0.0
 */

public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private Integer age;

    public Student(){

    }
    public Student(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


