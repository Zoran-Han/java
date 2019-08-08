package com.demo.work.impl;

import com.demo.work.Person;

/**
 * @ClassName Boss
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  19:36:52
 * @Version 1.0.0
 */

public class Boss implements Person {

    @Override
    public void eat() {

        System.out.println("吃饱了才有力气赚钱");
    }

    @Override
    public void sleep() {
        System.out.println("睡醒了才有力气赚钱");

    }
}
