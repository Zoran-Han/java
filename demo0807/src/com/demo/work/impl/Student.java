package com.demo.work.impl;

import com.demo.work.Person;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  19:36:22
 * @Version 1.0.0
 */

public class Student implements Person {

    @Override
    public void eat() {
        System.out.println("吃饱了才有力气学习");

    }

    @Override
    public void sleep() {
        System.out.println("睡醒了才有力气学习");

    }
}
