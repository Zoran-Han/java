package com.demo.collections.pojo;

import java.io.Serializable;

/**
 * @ClassName Employee
 * 职员类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  17:00:22
 * @Version 1.0.0
 */

public class Employee implements Serializable {

    private String name;
    private Integer salary;//工资

    public Employee() {

    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
