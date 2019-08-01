package com.demo.oop;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  15:43:14
 * @Version 1.0.0
 */

public class Person {
    String name = "张三";
    String gender = "男";
    int  age = 21;

    public Person(String name){

        System.out.println("父类构造方法");
        this.name = name;
    }
    public  void printMsg(){
        System.out.println(name+" "+gender+" " +age);
    }
    private  void show(){
        System.out.println("人员信息："+name+" "+gender+" " +age);
    }

}
