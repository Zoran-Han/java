package com.demo.work.impl;

import com.demo.work.IAnimal;

import java.io.Serializable;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  20:40:43
 * @Version 1.0.0
 */

public class Cat implements IAnimal, Serializable {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat() {
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
        System.out.println("小猫爱吃鱼");
    }

    @Override
    public void skill() {

        System.out.println("小猫会喵喵喵");
    }
}
