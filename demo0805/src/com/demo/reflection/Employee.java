package com.demo.reflection;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月05日  15:05:43
 * @Version 1.0.0
 */

public class Employee {
    /**
     * 姓名
     */
    public String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private int age;

    public Employee(){

    }

    public Employee(String name, String gender, int age) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return name+" "+gender+" "+age;
    }
}
