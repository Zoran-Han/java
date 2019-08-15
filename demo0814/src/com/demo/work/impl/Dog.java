package com.demo.work.impl;

import com.demo.work.IAnimal;

import java.io.Serializable;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  20:40:10
 * @Version 1.0.0
 */

public class Dog implements IAnimal , Serializable {

    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void eat() {

        System.out.println("小狗爱吃骨头");
    }

    @Override
    public void skill() {

        System.out.println("小狗会汪汪汪");
    }
}
